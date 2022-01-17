package com.example.getmesocialservice.resource;
import com.example.getmesocialservice.Model.Comment;
import com.example.getmesocialservice.service.CommentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentResource {

    @Autowired
    private CommentService commentService;

    @PostMapping
    public Comment savecomment(@RequestBody @Valid Comment comment){
        return commentService.saveComment(comment);

    }

    @GetMapping
    public List<Comment> getAllcomments(){
        return commentService.getAllComments();
    }
    @PutMapping
    public Comment updatecomment(@RequestBody Comment comment){
        return commentService.updateComment(comment);
    }
    @DeleteMapping
    public void deletecomment(@RequestParam(name = "commentId") String commentId){
        commentService.deleteUser(commentId);
    }

}

