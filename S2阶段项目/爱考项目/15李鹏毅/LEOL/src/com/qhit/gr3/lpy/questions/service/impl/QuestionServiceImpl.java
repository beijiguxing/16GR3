package com.qhit.gr3.lpy.questions.service.impl;

import java.util.List;
import java.util.Map;

import com.qhit.gr3.lpy.common.bean.PageBean;
import com.qhit.gr3.lpy.questions.bean.WrittenQuestion;
import com.qhit.gr3.lpy.questions.dao.QuestionDao;
import com.qhit.gr3.lpy.questions.dao.impl.QuestionDaoImpl;
import com.qhit.gr3.lpy.typeManage.bean.Course;

public class QuestionServiceImpl implements com.qhit.gr3.lpy.questions.service.QuestionService {
	private QuestionDao questionDao = new QuestionDaoImpl();

	@Override
	public List<Course> getCourseInfo(Map parameter) {
		return questionDao.getCourseInfo(parameter);
	}

	@Override
	public PageBean<WrittenQuestion> getWrittenList(
			PageBean<WrittenQuestion> pageBean, 
			Course course,
			int pageIndex) {
		return questionDao.getWrittenList(pageBean, course, pageIndex);
	}

	@Override
	public void addWrittenQuestion(WrittenQuestion writtenQuestion) {
		questionDao.addWrittenQuestion(writtenQuestion);
	}

	@Override
	public WrittenQuestion getWrittenQuestionById(
			WrittenQuestion writtenQuestion) {
		return questionDao.getWrittenQuestionById(writtenQuestion);
	}

	@Override
	public void updateWrittenQuestion(WrittenQuestion writtenQuestion) {
		questionDao.updateWrittenQuestion(writtenQuestion);
	}
	
	@Override
	public void inportWrittenQuestions(List<WrittenQuestion> listWQuestions) {
		questionDao.inportWrittenQuestions(listWQuestions);
	}

	@Override
	public int getQuestionsMax(int csId,String qtype,String degree) {
		// TODO Auto-generated method stub
		return questionDao.getQuestionsMax(csId, qtype, degree);
	}
}
