package ua.nure.service;

import ua.nure.dao.CommentDao;
import ua.nure.entity.Comment;

import java.util.List;

/**
 * Created by Dmitry on 15.04.2014.
 */
public class CommentService {

    public List<Comment> getComments(Integer id) {
        CommentDao commentDao = new CommentDao();
        return commentDao.getComments(id);
    }

    public void createComment(Comment comment) {
        CommentDao commentDao = new CommentDao();
        commentDao.add(comment);
    }

    public void editComment(Comment comment) {
        CommentDao commentDao = new CommentDao();
        commentDao.update(comment);
    }

    public void deleteComment(Integer id) {
        CommentDao commentDao = new CommentDao();
        commentDao.remove(id);
    }
}
