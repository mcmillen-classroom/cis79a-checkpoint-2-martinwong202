package MartinWong.quizapp;

public class Question {
    private int mTextResId;
    private int mHintTextResId;
    private boolean mAnswer;


    public Question(int textResId, int hintResId, boolean answer) {
        mTextResId = textResId;
        mHintTextResId=hintResId;
        mAnswer = answer;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean getAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }
}