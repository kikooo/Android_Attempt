package cn.kikooo.secondattempt;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    double result = 0;
    double n1 = 0,n2 = 0;
    static int operator = 0;
    static boolean start = false;
    static boolean usedPoint = false;
    static boolean usedOperator = false;
    static boolean isN1Int = false;
    static boolean isN2Int = false;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);     //调用父类的oncreate方法
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);     //调用布局

        //声明一堆东西
        Button btn1 = (Button) findViewById(R.id.button_one);
        Button btn2 = (Button) findViewById(R.id.button_two);
        Button btn3 = (Button) findViewById(R.id.button_three);
        Button btn4 = (Button) findViewById(R.id.button_four);
        Button btn5 = (Button) findViewById(R.id.button_five);
        Button btn6 = (Button) findViewById(R.id.button_six);
        Button btn7 = (Button) findViewById(R.id.button_seven);
        Button btn8 = (Button) findViewById(R.id.button_eight);
        Button btn9 = (Button) findViewById(R.id.button_nine);
        Button btn0 = (Button) findViewById(R.id.button_zero);
        Button btndiv = (Button) findViewById(R.id.button_divide);
        Button btnmul = (Button) findViewById(R.id.button_multiple);
        Button btnc = (Button) findViewById(R.id.button_clear);
        Button btndel = (Button) findViewById(R.id.button_del);
        Button btnadd = (Button) findViewById(R.id.button_add);
        Button btnmin = (Button) findViewById(R.id.button_minus);
        Button btnp = (Button) findViewById(R.id.button_point);
        Button btne = (Button) findViewById(R.id.button_equal);


        //设置监听
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnadd.setOnClickListener(this);
        btnc.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        btndel.setOnClickListener(this);
        btne.setOnClickListener(this);
        btnmin.setOnClickListener(this);
        btnmul.setOnClickListener(this);
        btnp.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        TextView textView_result = (TextView) findViewById(R.id.textView_result);
        String str;
        switch(v.getId()){
            case R.id.button_del:
                str =textView_result.getText().toString();
                if (str.length()==1)
                {
                    if(str.equals("+")||str.equals("-")||str.equals("×")||str.equals("÷")){
                        return;
                    }else{
                        textView_result.setText("0");
                    }
                }else {
                    str = str.substring(0,str.length()-1);
                    textView_result.setText(str);
                }
                break;
            case R.id.button_clear:
                textView_result.setText("0");
                start = false;
                usedPoint = false;
                usedOperator = false;
                isN1Int = false;
                isN2Int = false;
                operator = 0;
                n1 = 0;
                break;
            case R.id.button_zero:
                if(textView_result.getText().toString().length()>=10)
                    return;
                if (start){
                    textView_result.setText("0");
                    start=false;
                    n1 = 0;
                }
                str =textView_result.getText().toString();
                if (str.equals("0")){
                    str = "0";
                }
                else{
                    str += "0";
                }
                textView_result.setText(str);
                break;
            case R.id.button_one:
                if(textView_result.getText().toString().length()>=10)
                    return;
                if (start){
                    textView_result.setText("0");
                    start=false;
                    n1 = 0;
                }
                str =textView_result.getText().toString();
                if (str.equals("0")){
                    str = "1";
                }
                else{
                    str += "1";
                }
                textView_result.setText(str);
                break;
            case R.id.button_two:
                if(textView_result.getText().toString().length()>=10)
                    return;
                if (start){
                    textView_result.setText("0");
                    start=false;
                    n1 = 0;
                }
                str =textView_result.getText().toString();
                if (str.equals("0")){
                    str = "2";
                }
                else{
                    str += "2";
                }
                textView_result.setText(str);
                break;
            case R.id.button_three:
                if(textView_result.getText().toString().length()>=10)
                    return;
                if (start){
                    textView_result.setText("0");
                    start=false;
                    n1 = 0;
                }
                str =textView_result.getText().toString();
                if (str.equals("0")){
                    str = "3";
                }
                else{
                    str += "3";
                }
                textView_result.setText(str);
                break;
            case R.id.button_four:
                if(textView_result.getText().toString().length()>=10)
                    return;
                if (start){
                    textView_result.setText("0");
                    start=false;
                    n1 = 0;
                }
                str =textView_result.getText().toString();
                if (str.equals("0")){
                    str = "4";
                }
                else{
                    str += "4";
                }
                textView_result.setText(str);
                break;
            case R.id.button_five:
                if(textView_result.getText().toString().length()>=10)
                    return;
                if (start){
                    textView_result.setText("0");
                    start=false;
                    n1 = 0;
                }
                str =textView_result.getText().toString();
                if (str.equals("0")){
                    str = "5";
                }
                else{
                    str += "5";
                }
                textView_result.setText(str);
                break;
            case R.id.button_six:
                if(textView_result.getText().toString().length()>=10)
                    return;
                if (start){
                    textView_result.setText("0");
                    start=false;
                    n1 = 0;
                }
                str =textView_result.getText().toString();
                if (str.equals("0")){
                    str = "6";
                }
                else{
                    str += "6";
                }
                textView_result.setText(str);
                break;
            case R.id.button_seven:
                if(textView_result.getText().toString().length()>=10)
                    return;
                if (start){
                    textView_result.setText("0");
                    start=false;
                    n1 = 0;
                }
                str =textView_result.getText().toString();
                if (str.equals("0")){
                    str = "7";
                }
                else{
                    str += "7";
                }
                textView_result.setText(str);
                break;
            case R.id.button_eight:
                if(textView_result.getText().toString().length()>=10)
                    return;
                if (start){
                    textView_result.setText("0");
                    start=false;
                    n1 = 0;
                }
                str =textView_result.getText().toString();
                if (str.equals("0")){
                    str = "8";
                }
                else{
                    str += "8";
                }
                textView_result.setText(str);
                break;
            case R.id.button_nine:
                if(textView_result.getText().toString().length()>=10)
                    return;
                if (start){
                    textView_result.setText("0");
                    start=false;
                    n1 = 0;
                }
                str =textView_result.getText().toString();
                if (str.equals("0")){
                    str = "9";
                }
                else{
                    str += "9";
                }
                textView_result.setText(str);
                break;

            case R.id.button_point:
                if(textView_result.getText().toString().length()>=10)
                    return;
                if (start){
                    textView_result.setText("0");
                    start = false;
                    n1 = 0;
                }
                if (usedPoint){
                    Toast.makeText(MainActivity.this,"一个数里只能有一个小数点哟~",Toast.LENGTH_SHORT).show();
                }else {
                    str =textView_result.getText().toString();
                    str +=".";
                    textView_result.setText(str);
                    usedPoint = true;
                }
                break;

            case R.id.button_add:
                String strAdd = textView_result.getText().toString();
                if(strAdd.equals(null)){
                    return;
                }
                if(usedOperator){
                    Toast.makeText(MainActivity.this,"已经有一个操作符了哟~",Toast.LENGTH_SHORT).show();
                    return;
                }else {
                    n1 = Double.valueOf(strAdd);
                    if (n1==(double) ((int)n1)){
                        isN1Int = true;
                    }
                    textView_result.setText("＋");
                    operator = 1;
                    start = false;
                    usedPoint = false;
                    usedOperator = true;
                }
                break;
            case R.id.button_minus:
                String strMin = textView_result.getText().toString();
                if(strMin.equals(null)){
                    return;
                }
                if(usedOperator){
                    Toast.makeText(MainActivity.this,"已经有一个操作符了哟~",Toast.LENGTH_SHORT).show();
                    return;
                }else {
                    n1 = Double.valueOf(strMin);
                    if (n1==(double) ((int)n1)){
                        isN1Int = true;
                    }
                    textView_result.setText("-");
                    operator = 2;
                    start = false;
                    usedPoint = false;
                    usedOperator = true;
                }
                break;
            case R.id.button_multiple:
                String strMul = textView_result.getText().toString();
                if(strMul.equals(null)){
                    return;
                }
                if(usedOperator){
                    Toast.makeText(MainActivity.this,"已经有一个操作符了哟~",Toast.LENGTH_SHORT).show();
                    return;
                }else {
                    n1 = Double.valueOf(strMul);
                    if (n1==(double) ((int)n1)){
                        isN1Int = true;
                    }
                    textView_result.setText("×");
                    operator = 3;
                    start = false;
                    usedPoint = false;
                    usedOperator = true;
                }
                break;
            case R.id.button_divide:
                String strDiv = textView_result.getText().toString();
                if(strDiv.equals(null)){
                    return;
                }
                if(usedOperator){
                    Toast.makeText(MainActivity.this,"已经有一个操作符了哟~",Toast.LENGTH_SHORT).show();
                    return;
                }else {
                    n1 = Double.valueOf(strDiv);
                    if (n1==(double) ((int)n1)){
                        isN1Int = true;
                    }
                    textView_result.setText("÷");
                    operator = 4;
                    start = false;
                    usedPoint = false;
                    usedOperator = true;
                }
                break;
            case R.id.button_equal:
                str = textView_result.getText().toString();
                if (textView_result.getText().toString().equals(null)){
                    return;
                }
                textView_result.setText(null);
                switch (operator){
                    case 0:
                        n2 = Double.valueOf(str);
                        result=n2;
                        break;
                    case 1:
                        if(str.substring(1,str.length()).equals(null)){
                            n2 = 0;
                        }else{
                            n2 = Double.valueOf(str.substring(1,str.length()));
                        }
                        if (n2==(double) ((int)n1)){
                            isN2Int = true;
                        }
                        result = n1+n2;
                        break;
                    case 2:
                        if(str.substring(1,str.length()).equals(null)){
                            n2 = 0;
                        }else{
                            n2 = Double.valueOf(str.substring(1,str.length()));
                        }
                        if (n2==(double) ((int)n1)){
                            isN2Int = true;
                        }
                        result = n1-n2;
                        break;
                    case 3:
                        if(str.substring(1,str.length()).equals(null)){
                            n2 = 0;
                        }else{
                            n2 = Double.valueOf(str.substring(1,str.length()));
                        }
                        if (n2==(double) ((int)n1)){
                            isN2Int = true;
                        }
                        result = n1*n2;
                        break;
                    case 4:
                        if(str.substring(1,str.length()).equals(null)){
                            n2 = 0;
                        }else{
                            n2 = Double.valueOf(str.substring(1,str.length()));
                        }
                        if (n2==(double) ((int)n1)){
                            isN2Int = true;
                        }
                        result = n1/n2;
                        break;
                    default:
                        result = 0;
                        break;
                }
                if (result==(double) ((int)result)){
                    int intResult = (int)result;
                    textView_result.setText(String.valueOf(intResult));
                    isN1Int = true;
                }else {
                    result *= 10000000;
                    int temp = (int)result;
                    result = temp;
                    result /= 10000000;
                    textView_result.setText(String.valueOf(result));
                    isN1Int = false;
                }
                start = true;
                usedPoint = false;
                usedOperator = false;
                isN2Int = false;
                n1 = result;
                n2 = 0;
                operator = 0;
                break;
            default:
                break;
        }
    }
}
