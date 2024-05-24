package com.httpMethods.Support.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class FeedbackController {
    //@RequestMapping(value="/feedbacks", method = RequestMethod.GET)
    @GetMapping("/feedbacks")
    public List<String> getFeedbacks(){
        List<String> feedbacks = Arrays.asList(
                "Nice work",
                "Good work",
                "valuable things"
        );
        return feedbacks;
    }

    @PostMapping("/createFeedback")
    public String createFeedback(){
        System.out.println("Feedback created");
        return "Created FeedBack";
    }

    /*
    @PutMapping
    @DeleteMapping
    @PatchMapping
     */
}
