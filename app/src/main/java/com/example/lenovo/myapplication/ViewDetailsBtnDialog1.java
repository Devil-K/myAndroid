package com.example.lenovo.myapplication;
//first133的向下跳的scroll view
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
public class ViewDetailsBtnDialog1  extends DialogFragment {
    @Bind(R.id.tvProjectIntroduction1)
    TextView tvProjectIntroduction1;
    @Bind(R.id.tvShareAllocation1)
    TextView tvShareAllocation1;
    @Bind(R.id.tvProjectAdvantage1)
    TextView tvProjectAdvantage1;
    @Bind(R.id.tvMoneyUse1)
    TextView tvMoneyUse1;
    @Bind(R.id.tvEnterpriseEvaluation1)
    TextView tvEnterpriseEvaluation1;
    private MyListener MyListener;
    private View inflate;

    public void setListener(MyListener listener) {
        this.MyListener = listener;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
        getDialog().setCanceledOnTouchOutside(true);
        getDialog().getWindow().setBackgroundDrawableResource(R.color.transparent);
        inflate = inflater.inflate(R.layout.dialog_view_details_btn1, container);
        ButterKnife.bind(this, inflate);
        return inflate;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @OnClick({R.id.tvProjectIntroduction1, R.id.tvShareAllocation1, R.id.tvProjectAdvantage1, R.id.tvMoneyUse1, R.id.tvEnterpriseEvaluation1})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvProjectIntroduction1:
                MyListener.projectIntroduction();
                dismiss();
                break;
            case R.id.tvShareAllocation1:
                MyListener.shareAllocation();
                dismiss();
                break;
            case R.id.tvProjectAdvantage1:
                MyListener.projectAdvantage();
                dismiss();
                break;
            case R.id.tvMoneyUse1:
                MyListener.moneyUse();
                dismiss();
                break;
            case R.id.tvEnterpriseEvaluation1:
                MyListener.enterpriseEvaluation();
                dismiss();
                break;
        }
    }

    public interface MyListener {
        void projectIntroduction(); //温轧机参数
        void shareAllocation(); // 温轧机操作
        void projectAdvantage(); // 温轧机液压系统
        void moneyUse(); // 温轧机传动
        void enterpriseEvaluation(); //未使用
    }

    //全屏宽度操作
    @Override
    public void onStart() {
        super.onStart();
        ViewGroup.LayoutParams lp= inflate.getLayoutParams();
        DisplayMetrics dm = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics( dm );
        lp.width=dm.widthPixels;
        inflate.setLayoutParams(lp);
    }
}
