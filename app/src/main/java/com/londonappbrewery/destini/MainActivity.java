package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mQuestionTextView;
    Button mAnswerTopButton;
    Button mAnswerBottomButton;
    int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:


        mQuestionTextView = findViewById(R.id.storyTextView);
        mAnswerTopButton = findViewById(R.id.buttonTop);
        mAnswerBottomButton = findViewById(R.id.buttonBottom);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mAnswerTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("destini", "onClick: Top button clicked!");
                if (mStoryIndex == 1) {
                    mQuestionTextView.setText(R.string.T3_Story);
                    mAnswerTopButton.setText(R.string.T3_Ans1);
                    mAnswerBottomButton.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                } else if (mStoryIndex == 2){
                    mQuestionTextView.setText(R.string.T3_Story);
                    mAnswerTopButton.setText(R.string.T3_Ans1);
                    mAnswerBottomButton.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                } else {
                    mQuestionTextView.setText(R.string.T6_End);
                    mAnswerTopButton.setVisibility(View.GONE);
                    mAnswerBottomButton.setVisibility(View.GONE);
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mAnswerBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("destini", "onClick: Bottom button clicked!");
                if (mStoryIndex == 1){
                    mQuestionTextView.setText(R.string.T2_Story);
                    mAnswerTopButton.setText(R.string.T2_Ans1);
                    mAnswerBottomButton.setText(R.string.T3_Ans2);
                    mStoryIndex = 2;
                } else if (mStoryIndex == 2){
                    mQuestionTextView.setText(R.string.T4_End);
                    mAnswerTopButton.setVisibility(View.GONE);
                    mAnswerBottomButton.setVisibility(View.GONE);
                } else{
                    mQuestionTextView.setText(R.string.T5_End);
                    mAnswerTopButton.setVisibility(View.GONE);
                    mAnswerBottomButton.setVisibility(View.GONE);
                }
            }
        });

    }
}
