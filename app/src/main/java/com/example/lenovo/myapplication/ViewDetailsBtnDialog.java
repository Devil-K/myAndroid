package com.example.lenovo.myapplication;
//first131的向下跳的scroll view
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
public class ViewDetailsBtnDialog  extends DialogFragment {
    @Bind(R.id.tvProjectIntroduction)
    TextView tvProjectIntroduction;
    @Bind(R.id.tvShareAllocation)
    TextView tvShareAllocation;
    @Bind(R.id.tvProjectAdvantage)
    TextView tvProjectAdvantage;
    @Bind(R.id.tvMoneyUse)
    TextView tvMoneyUse;
    @Bind(R.id.tvEnterpriseEvaluation)
    TextView tvEnterpriseEvaluation;
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
        inflate = inflater.inflate(R.layout.dialog_view_details_btn, container);
        ButterKnife.bind(this, inflate);
        return inflate;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @OnClick({R.id.tvProjectIntroduction, R.id.tvShareAllocation, R.id.tvProjectAdvantage, R.id.tvMoneyUse, R.id.tvEnterpriseEvaluation})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvProjectIntroduction:
                MyListener.projectIntroduction();
                dismiss();
                break;
            case R.id.tvShareAllocation:
                MyListener.shareAllocation();
                dismiss();
                break;
            case R.id.tvProjectAdvantage:
                MyListener.projectAdvantage();
                dismiss();
                break;
            case R.id.tvMoneyUse:
                MyListener.moneyUse();
                dismiss();
                break;
            case R.id.tvEnterpriseEvaluation:
                MyListener.enterpriseEvaluation();
                dismiss();
                break;
        }
    }

    public interface MyListener {
        void projectIntroduction(); // 铸轧机参数
        void shareAllocation(); // 铸轧机棒图
        void projectAdvantage(); // 铸轧机调零
        void moneyUse(); // 铸轧机液压系统
        void enterpriseEvaluation(); // 铸轧机传动
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
