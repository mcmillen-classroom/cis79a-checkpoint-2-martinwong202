package MartinWong.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView mTextView;

    private Button mTrueButton;
    private Button mFalseButton;
    private Button mNextButton;

    private MartinWong.quizapp.Question[] mQuestions;
    private int mIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTrueButton = (Button) findViewById(R.id.true_button);
        mFalseButton = (Button) findViewById(R.id.false_button);
        mNextButton = (Button) findViewById(R.id.next_button);

        mTrueButton.setOnClickListener(this);
        mFalseButton.setOnClickListener(this);
        mNextButton.setOnClickListener(this);

        mQuestions= new MartinWong.quizapp.Question[5];
        mIndex=0;

        mTextView=(TextView) findViewById(R.id.text_view);
        mQuestions[0]= new MartinWong.quizapp.Question(R.string.question1, true);
        mQuestions[1]= new MartinWong.quizapp.Question(R.string.question2, true);
        mQuestions[2]= new MartinWong.quizapp.Question(R.string.question3, true);
        mQuestions[3]= new MartinWong.quizapp.Question(R.string.question4, false);
        mQuestions[4]= new MartinWong.quizapp.Question(R.string.question5, true);

        mTextView.setText(mQuestions[mIndex].getTextResId());
    }

    @Override
    public void onClick(View view) {
        if(view.getId()== R.id.true_button ) {
            checkAnswer(true);
        }else if(view.getId()== R.id.false_button ) {
            checkAnswer(false);
        }
        else if(view.getId()== R.id.next_button)
        {
            mIndex++;
            //Do if statement here:

            mTextView.setText(mQuestions[mIndex].getTextResId());


        }
    }
    public boolean checkAnswer(boolean userInput)
    {
        if(mQuestions[mIndex].getAnswer()==userInput)
        {
            Toast myToast = Toast.makeText(this, "You are correct", Toast.LENGTH_SHORT);
            myToast.show();
            return true;
        }
        else
        {
            Toast myToast = Toast.makeText(this, "You are incorrect", Toast.LENGTH_SHORT);
            myToast.show();
            return false;
        }
    }
}