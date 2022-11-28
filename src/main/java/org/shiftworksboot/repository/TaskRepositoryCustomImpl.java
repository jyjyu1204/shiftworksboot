package org.shiftworksboot.repository;

import com.querydsl.core.QueryResults;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.shiftworksboot.constant.TaskDept;
import org.shiftworksboot.dto.TaskDto;
import org.shiftworksboot.entity.QTask;
import org.shiftworksboot.entity.Task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import javax.persistence.EntityManager;
import java.util.List;

public class TaskRepositoryCustomImpl implements TaskRepositoryCustom{

    private JPAQueryFactory queryFactory;

    public TaskRepositoryCustomImpl(EntityManager em){
        this.queryFactory = new JPAQueryFactory(em);
    }

    @Override
    public Page<Task> getListWithPaging(TaskDto taskDto, Pageable pageable) {

        QTask qTask = QTask.task;
        List<Task> taskList = queryFactory
                .selectFrom(qTask)
                .where(searchTitle(taskDto.getTask_title()),
                        searchContent(taskDto.getTask_content()),
                        selectDept(taskDto.getDept_id()))
                .orderBy(QTask.task.task_id.desc())
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();

        return new PageImpl<Task>(taskList, pageable, taskList.size());
    }


    // where절 조건 입력을 위한 BooleanExpression

    // 제목으로 검색
    private BooleanExpression searchTitle(String task_title) {
        return StringUtils.hasText(task_title) ? QTask.task.task_title.eq(task_title) : null;
    }
    // 내용으로 검색
    private BooleanExpression searchContent(String task_content) {
        return StringUtils.hasText(task_content) ? QTask.task.task_content.eq(task_content) : null;
    }

    // 부서별 출력
    private BooleanExpression selectDept(TaskDept taskDept) {
        return ObjectUtils.isEmpty(taskDept) ? null : QTask.task.dept_id.eq(taskDept);
    }


}
