package za.co.knuckles.testinganddebugging;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MainActivityView, View.OnClickListener {


    Button mButtonCalculate;
    EditText mEditTextNumberToCalculate;
    TextView mTextViewAnswer;
    ConstraintLayout mParentLayout;

    MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainActivityPresenter(this);

        mButtonCalculate = findViewById(R.id.buttonCalculate);
        mEditTextNumberToCalculate = findViewById(R.id.inputNumberToCalc);
        mTextViewAnswer = findViewById(R.id.textViewAnswer);
        mParentLayout = findViewById(R.id.parentLayout);

        mButtonCalculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //Only care if the button is clicked
        if (view.getId() == mButtonCalculate.getId()) {
            String userInput = mEditTextNumberToCalculate.getText().toString();
            presenter.calculateFizzBuzz(Integer.parseInt(userInput));
        }
    }

    @Override
    public void setSuccessfulFizzbuzz(String fizzbuzzText) {
        mTextViewAnswer.setText(fizzbuzzText);
        mParentLayout.setBackgroundColor(getResources().getColor(R.color.colorSuccess));
    }

    @Override
    public void setErroneousFizzbuzz() {
        mTextViewAnswer.setText("");
        mParentLayout.setBackgroundColor(getResources().getColor(R.color.colorError));
    }
}
