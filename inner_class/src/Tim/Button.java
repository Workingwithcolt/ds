package Tim;

public class Button {
    private String title;
    private OnClickListener onClickListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void OnClick() {
        this.onClickListener.Onclick(this.title);
    }

    public interface OnClickListener {
        public void Onclick(String title);

    }
}