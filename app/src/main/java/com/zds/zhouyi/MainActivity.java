package com.zds.zhouyi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.animation.Animator;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieDrawable;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

/**
 * @author ZDS
 */
public class MainActivity extends AppCompatActivity {

    TextView tvStart;
    TextView tvStartTips;
    LottieAnimationView lottieAnimationView;
    ConstraintLayout coinLayout;
    TextView coin1;
    TextView coin2;
    TextView coin3;
    TextView tvResult;

    TextView tvSeeAll;

    int clickCount;

    int[] result1;
    int[] result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result1 = new int[3];
        result2 = new int[3];
        tvStart = findViewById(R.id.tv_start);
        tvStartTips = findViewById(R.id.tv_start_tips);
        lottieAnimationView = findViewById(R.id.lottie_throw);
        tvResult = findViewById(R.id.tv_result);
        coinLayout = findViewById(R.id.cl_coin_result);
        coin1 = findViewById(R.id.iv_coin1);
        coin2 = findViewById(R.id.iv_coin2);
        coin3 = findViewById(R.id.iv_coin3);
        tvSeeAll = findViewById(R.id.tv_see_all);
        tvSeeAll.setMovementMethod(new ScrollingMovementMethod());
        lottieAnimationView.setAnimation("loading.json");
        lottieAnimationView.setRepeatCount(3);
        lottieAnimationView.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(@NonNull Animator animation) {

            }

            @Override
            public void onAnimationEnd(@NonNull Animator animation) {
                lottieAnimationView.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationCancel(@NonNull Animator animation) {

            }

            @Override
            public void onAnimationRepeat(@NonNull Animator animation) {

            }
        });

        tvStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickCount == 0) {
                    tvStart.setText("开始预测");
                } else if (clickCount == 1) {
                    tvStart.setText("请再投一次");
                }
                lottieAnimationView.setVisibility(View.VISIBLE);
                lottieAnimationView.playAnimation();
                getCoinResult();
                clickCount++;
                if (clickCount > 1) {
                    clickCount = 0;
                }
            }
        });


        tvSeeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                tvSeeAll.setBackground(null);
                StringBuilder sb = new StringBuilder();
                for (Gua gua : Const.sixtyFourDiagramsMap) {
                    sb.append(gua.toString());
                    sb.append("\n ");
                }
                //sb.setLength(sb.length() - 2);
                // 删除最后一个逗号和空格
                tvSeeAll.setText(sb.toString());
            }
        });
    }

    private void getCoinResult() {
        coinLayout.setVisibility(View.VISIBLE);
        Random random = new Random();

        boolean bool1 = random.nextBoolean();
        boolean bool2 = random.nextBoolean();
        boolean bool3 = random.nextBoolean();

        coin1.setText(bool1 ? "正" : "反");
        coin2.setText(bool2 ? "正" : "反");
        coin3.setText(bool3 ? "正" : "反");
        if (clickCount == 0) {
            result1[0] = bool1 ? 1 : 0;
            result1[1] = bool2 ? 1 : 0;
            result1[2] = bool3 ? 1 : 0;
        } else if (clickCount == 1) {
            result2[0] = bool1 ? 1 : 0;
            result2[1] = bool2 ? 1 : 0;
            result2[2] = bool3 ? 1 : 0;
            //遍历Map
            Set<Map.Entry<int[], Integer>> entries = Const.eightDiagramsMap.entrySet();
            int numberOne = 0, numberTwo = 0;
            for (Map.Entry<int[], Integer> entry : entries) {
                if (Arrays.equals(entry.getKey(), result1)) {
                    numberOne = entry.getValue();
                }
                if (Arrays.equals(entry.getKey(), result2)) {
                    numberTwo = entry.getValue();
                }
            }
            int resultNumber = numberOne * 10 + numberTwo;
            Gua nowGua = null;
            for (Gua gua : Const.sixtyFourDiagramsMap) {
                if (gua.getId() == resultNumber) {
                    nowGua = gua;
                }
            }
            if (nowGua != null) {
                tvResult.setText("结果是：\n" + "   序号：" + resultNumber + " 第" + nowGua.getIndexGua() + "卦 " + nowGua.getName() + "-- " + nowGua.getDescrip());
            }
        }
    }

}