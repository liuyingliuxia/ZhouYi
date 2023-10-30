package com.zds.zhouyi;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * @Author: ZDS
 * @Date: 2023/2/4
 * @Desc:
 */
public class CustomDialog extends Dialog {
    public CustomDialog(Context context) {
        super(context);
    }

    public CustomDialog(Context context, int theme) {
        super(context, theme);
    }

    public static class Builder {
        private Context context;
        private String content;
        private String posText = "确 定";
        private String negText = "取 消";
        private DialogInterface.OnClickListener positiveButtonClickListener;
        private DialogInterface.OnClickListener negativeButtonClickListener;

        public Builder(Context context) {
            this.context = context;
        }

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }

        public Builder setPositiveButton(DialogInterface.OnClickListener listener) {
            this.positiveButtonClickListener = listener;
            return this;
        }

        public Builder setNegativeButton(DialogInterface.OnClickListener listener) {
            this.negativeButtonClickListener = listener;
            return this;
        }

        public Builder setPositiveBtnText(String text) {
            this.posText = text;
            return this;
        }

        public Builder setNegativeBtnText(String text) {
            this.negText = text;
            return this;
        }

        public CustomDialog create() {
            LayoutInflater layoutInflater = (LayoutInflater)
                    context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            //为自定义弹框设置主题
            CustomDialog customDialog = new CustomDialog(context, R.style.CustomDialog);
            View view = layoutInflater.inflate(R.layout.dialog_base, null);
            customDialog.addContentView(
                    view, new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT,
                            LinearLayout.LayoutParams.MATCH_PARENT
                    )
            );
            //设置弹框内容
            TextView tvContent = ((TextView) view.findViewById(R.id.tv_detail));
            tvContent.setText(content);

            tvContent.setMovementMethod(new ScrollingMovementMethod());

            customDialog.setContentView(view);
            return customDialog;
        }
    }
}
