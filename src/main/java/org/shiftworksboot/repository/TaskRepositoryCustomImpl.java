package org.shiftworksboot.repository;

import com.querydsl.core.QueryResults;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.shiftworksboot.dto.TaskDto;
import org.shiftworksboot.entity.QTask;
import org.shiftworksboot.entity.Task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.persistence.EntityManager;

public class TaskRepositoryCustomImpl implements TaskRepositoryCustom{

    private JPAQueryFactory queryFactory;

    public TaskRepositoryCustomImpl(EntityManager em){
        this.queryFactory = new JPAQueryFactory(em);
    }

    @Override
    public Page<Task> getListWithPaging(TaskDto taskDto, Pageable pageable) {


        /*QTask qTask = QTask.task;
        QueryResults<Task> queryResults = queryFactory
                .selectFrom(qTask)
                .where(qTask.task_title.eq(taskDto.getTask_title()))
                .w;*/


        return null;
    }
}
