package kr.tjeit.a20181216_baemincopy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

    LinearLayout koreanFoodBtn;
    LinearLayout bunsikBtn;
    LinearLayout japanesFoodBtn;
    private LinearLayout chickenBtn;
    private LinearLayout pizzaBtn;
    private LinearLayout chineseBtn;
    private LinearLayout jokbalBtn;
    private LinearLayout yasikBtn;
    private LinearLayout soupBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        setContentView 에 커서를 두고, Alt+insert 키를 누르면 자동으로 변수가 뜬다.
//        그걸 잘라내서 바인드뷰에 붙여 넣는다!
        bindViews();
        setupEvents();
        setValues();

    }


    @Override
    public void setupEvents() {

//        한식 버튼이 눌렸을때 할일.
//        koreanFoodBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                Toast.makeText(mContext, "한식을 눌렀습니다.", Toast.LENGTH_SHORT).show();
////한식이 눌렸다는 사실을 레스토랑 리스트 액티비티에 알려주고 싶음 ==> Intent 사이에 putextra 넣어줌
//
//
//
//                Intent intent = new Intent(mContext, RestaurantListActivity.class);
//                intent.putExtra("음식종류", "한식");
//                startActivity(intent);
//
//            }
//        });

        View.OnClickListener foodKindClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//          첫번재 방법 예시
//             if (v.getId() == R.id.chickenBtn){
//                    Toast.makeText(mContext, "치킨 눌림", Toast.LENGTH_SHORT).show();
//                }
//                else if (v.getId()==R.id.pizzaBtn){
//                    Toast.makeText(mContext, "피자 눌림", Toast.LENGTH_SHORT).show();
//                }

////                두번째 방법: XML 파일에 태그로 작성!
//                Toast.makeText(mContext,v.getTag().toString(), Toast.LENGTH_SHORT).show();

//
                Intent intent = new Intent(mContext, RestaurantListActivity.class);
                intent.putExtra("음식종류", v.getTag().toString());
                startActivity(intent);

            }
        };

        koreanFoodBtn.setOnClickListener(foodKindClickListener);
        chineseBtn.setOnClickListener(foodKindClickListener);
        bunsikBtn.setOnClickListener(foodKindClickListener);
        chickenBtn.setOnClickListener(foodKindClickListener);
        pizzaBtn.setOnClickListener(foodKindClickListener);
        chineseBtn.setOnClickListener(foodKindClickListener);
        jokbalBtn.setOnClickListener(foodKindClickListener);
        yasikBtn.setOnClickListener(foodKindClickListener);
        soupBtn.setOnClickListener(foodKindClickListener);


    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.soupBtn = (LinearLayout) findViewById(R.id.soupBtn);
        this.yasikBtn = (LinearLayout) findViewById(R.id.yasikBtn);
        this.jokbalBtn = (LinearLayout) findViewById(R.id.jokbalBtn);
        this.chineseBtn = (LinearLayout) findViewById(R.id.chineseBtn);
        this.pizzaBtn = (LinearLayout) findViewById(R.id.pizzaBtn);
        this.chickenBtn = (LinearLayout) findViewById(R.id.chickenBtn);
        this.japanesFoodBtn = (LinearLayout) findViewById(R.id.japanesFoodBtn);
        this.bunsikBtn = (LinearLayout) findViewById(R.id.bunsikBtn);
        this.koreanFoodBtn = (LinearLayout) findViewById(R.id.koreanFoodBtn);
    }
}








