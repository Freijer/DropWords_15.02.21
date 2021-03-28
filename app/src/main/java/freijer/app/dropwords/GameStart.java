package freijer.app.dropwords;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.os.Build;
import android.os.FileUtils;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.BounceInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import freijer.app.dropwords.DataBase.DataHelper;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;



//** АВТОЧТЕНИЕ из БАЗЫ ДАННЫХ в кноаку СТАРТ ИГРЫ




public class GameStart extends AppCompatActivity  {



    protected int lenght_minus_minus;
    private int lenght_plus; //переменная отвечающая за хранение последовательносит увеличения длинны слов на +1
    //переменная отвечающая за хранение последовательносит уменьшения длинны слов на -1
        public int getLenght_plus() {
            return lenght_plus;
        }
        public void setLenght_plus(int lenght_plus) {
            this.lenght_plus = lenght_plus;
        }
            public int getLenght_minus_minus() {
                return lenght_minus_minus;
            }
            public void setLenght_minus_minus(int lenght_minus_minus) {
                this.lenght_minus_minus = lenght_minus_minus;
            }

    ArrayList<String> lenght_plus_com;
    ArrayList<String> lenght_minus_com;


    Supports supportClass = new Supports();
    SharedPreferences sPref;
    final String SAVED_TEXT = "saved_text";
    protected int  number_max_lenght= 0;

    String read = "";
    String readWrong = "";
    String writeTrue = "";
    String writeWrong = "";

    private String text_plus_lenght;
    private String text_minus_lenght;

    //ачивки выводить не текстом, а "иконками" или не все, а только часть. Например за каждую 10 ачивку.
    DataHelper dbHelper;


    protected int flag = 0;
    protected int exp = 0;
    protected int time_word;
    private List<Integer> addScore = new ArrayList<>();


    public int getFlag() {
        return flag;
    }
    public void setFlag(int flag) {
        this.flag = flag;
    }
    public int getExp() {
        return exp;
    }
    public void setExp(int exp) {
        this.exp = exp;
    }


    protected int number_change_word = 5;
    public int getNumber_change_word() {
        return number_change_word;
    }
    public void setNumber_change_word(int number_change_word) {
        this.number_change_word = number_change_word;
    }

    int number_word_3 = 0;
    int number_word_4 = 0;
    int number_word_5 = 0;
    int number_word_6 = 0;
    int number_word_7 = 0;
    int number_word_8 = 0;
    int number_word_9 = 0;
    int number_word_10 = 0;


    String addsc;
    String addlvl;
    String addtryss;

    public String getAddsc() {
        return addsc;
    }
    public void setAddsc(String addsc) {
        this.addsc = addsc;
    }
    public String getAddlvl() {
        return addlvl;
    }
    public void setAddlvl(String addlvl) {
        this.addlvl = addlvl;
    }
    public String getAddtryss() {
        return addtryss;
    }
    public void setAddtryss(String addtryss) {
        this.addtryss = addtryss;
    }

    public int getNumber_word_3() {
        return number_word_3;
    }
    public void setNumber_word_3(int number_word_3) {
        this.number_word_3 = number_word_3;
    }
    public int getNumber_word_4() {
        return number_word_4;
    }
    public void setNumber_word_4(int number_word_4) {
        this.number_word_4 = number_word_4;
    }
    public int getNumber_word_5() {
        return number_word_5;
    }
    public void setNumber_word_5(int number_word_5) {
        this.number_word_5 = number_word_5;
    }
    public int getNumber_word_6() {
        return number_word_6;
    }
    public void setNumber_word_6(int number_word_6) {
        this.number_word_6 = number_word_6;
    }
    public int getNumber_word_7() {
        return number_word_7;
    }
    public void setNumber_word_7(int number_word_7) {
        this.number_word_7 = number_word_7;
    }
    public int getNumber_word_8() {
        return number_word_8;
    }
    public void setNumber_word_8(int number_word_8) {
        this.number_word_8 = number_word_8;
    }
    public int getNumber_word_9() {
        return number_word_9;
    }
    public void setNumber_word_9(int number_word_9) {
        this.number_word_9 = number_word_9;
    }
    public int getNumber_word_10() {
        return number_word_10;
    }
    public void setNumber_word_10(int number_word_10) {
        this.number_word_10 = number_word_10;
    }


    ArrayAdapter<String> adapterDone;


    //Правильные ответы
    ListView Thru_answer_1;
    ListView Thru_answer_2;
    ListView Thru_answer_3;
    ListView Thru_answer_4;

    ArrayList<String> thru_list_1;
    ArrayList<String> thru_list_2;
    ArrayList<String> thru_list_3;
    ArrayList<String> thru_list_4;

    ArrayAdapter<String> adapter_thru_1;
    ArrayAdapter<String> adapter_thru_2;
    ArrayAdapter<String> adapter_thru_3;
    ArrayAdapter<String> adapter_thru_4;
    //

    //Не правильные ответы
    ListView Wrong_answer_1;

    ArrayList<String> Wrong_list_1;

    ArrayAdapter<String> adapter_wrong_1;
    //

    ArrayList<String> bufferReadList;

    List<String> Alfas;
    List<String> WrongSwitch;
    ArrayList<String> TYU;
    ArrayList<String> ListBuffer;
    ArrayList<String> ListReadBuffer;

    FileOutputStream outputStream;
    String  myText;

    protected Button butClose, butCloseTask, butClose_mission;
    private AlertDialog OptionDialog, TaskDialog, MissionsDialog;


    protected int textFlag;
    public int getTextFlag() {
        return textFlag;
    }
    public void setTextFlag(int textFlag) {
        this.textFlag = textFlag;
    }

    protected int f001;


    ObjectAnimator  button1;
    ObjectAnimator  button2;
    ObjectAnimator  button3;
    ObjectAnimator  button4;
    ObjectAnimator  button5;
    ObjectAnimator  button6;
    ObjectAnimator  button7;
    ObjectAnimator  button8;
    ObjectAnimator  button9;
    ObjectAnimator  button10;
    ObjectAnimator  button11;
    ObjectAnimator  button12;
    ObjectAnimator  button13;
    ObjectAnimator  button14;

    TextView mis_1, mis_2, mis_3;
    protected ProgressBar progressBar;
    protected TextView lvlview, textClock, score, text_plus, text_minus, thisWordShow;
    protected TextView textLvl, textScore, tryChange, clock;
    protected Button progress,  faq, task, starter, reset, pr1, pr2, pr3, pr4, pr5, pr6, pr7, pr8, pr9, pr10, pr11, pr12, pr13, pr14;
    protected Button  quest;
    private ImageView img_nextlvl;
    protected ArrayList<String> MainListWord = new ArrayList<>();// при нажатии кнопки собисрется слово
    protected ArrayList<Integer> ListCoordinateX_1 = new ArrayList<Integer>();
    protected ArrayList<Integer> LineY_1 = new ArrayList<Integer>();
    private ArrayList<String> list;
    protected ArrayList<String> listControl;
    protected ArrayList<String> listBuffer = new ArrayList<String>();
    protected Chronometer mChronometer;
    protected RelativeLayout chars_layout;


    private int img0, img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12, img13, img14, img15, img16, im17, img18, img19, img20, img21, img22, img23, img324, img25, img26,
    img27, img28, img29, img30, img31, img32, img33, img34, img35, img36, img37, img38, img39, img40, img41, img42, img43, img44, img45, img46, img47, img48, img49, img50 = R.drawable.star;

    int a0 = 0;
    int a1 = 0;
    int a2 = 0;
    int a3 = 0;
    int a4 = 0;
    int a5 = 0;
    int a6 = 0;
    int a7 = 0;
    int a8 = 0;
    int a9 = 0;
    int a10 = 0;
    int a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, a29, a30, a31, a32, a33, a34, a35, a36, a37, a38, a39, a40, a41, a42, a43, a44, a45, a46, a47, a48 = 0;

    RecyclerViewAdapter adapter;
    ArrayList<Model> myValues = new ArrayList<>();
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;





    protected TextView char_1, char_2, char_3, char_4, char_5, char_6, char_7, char_8, char_9, char_10, char_11, char_12, char_13, char_14;
    protected Button ChekOut;
    private int indexWord;
    private String word;
    private Random r = new Random();
    protected String[] Original;
    protected String[] OriginalWord; //бавзовое слово
    protected String[] MixedleWord; //смешение
    protected String Control;
    private RelativeLayout Colo;
    private final int USERID = 6000;
    private int countID;
    protected int numsofliteralsinword;

    protected int list_2;
    protected int list_3;
    protected int list_4;
    protected int list_5;
    protected int list_6;
    protected int list_7;
    protected int list_8;
    protected int list_9;
    protected int list_10;
    protected int list_11;
    protected int list_12;
    protected int list_13;
    protected int list_14;

    protected int speed_a;
        public int getSpeed_a() {
            return speed_a;
        }
        public void setSpeed_a(int speed_a) {
            this.speed_a = speed_a;
        }

    public String getControl() {
        return Control;
    }
    public void setControl(String control) {
        Control = control;
    }


                        protected int stepOnNextLvl = 0; // ЧТЕНИЕ и ЗАПИСЬ В БД сохрание Уровня
                        public int getStepOnNextLvl() {
        return stepOnNextLvl;
    }
                        public void setStepOnNextLvl(int stepOnNextLvl) {
        this.stepOnNextLvl = stepOnNextLvl;
    }

    int counter; // ЧТЕНИЕ и ЗАПИСЬ В БД сохрание Очков
    public int getCounter() {
        return counter;
    }
    public void setCounter(int counter) {
        this.counter = counter;
    }



    public int getList_2() {
        return list_2;
    }
    public void setList_2(int list_2) {
        this.list_2 = list_2;
    }
    public int getList_3() {
        return list_3;
    }
    public void setList_3(int list_3) {
        this.list_3 = list_3;
    }
    public int getList_4() {
        return list_4;
    }
    public void setList_4(int list_4) {
        this.list_4 = list_4;
    }
    public int getList_5() {
        return list_5;
    }
    public void setList_5(int list_5) {
        this.list_5 = list_5;
    }
    public int getList_6() {
        return list_6;
    }
    public void setList_6(int list_6) {
        this.list_6 = list_6;
    }
    public int getList_7() {
        return list_7;
    }
    public void setList_7(int list_7) {
        this.list_7 = list_7;
    }
    public int getList_8() {
        return list_8;
    }
    public void setList_8(int list_8) {
        this.list_8 = list_8;
    }
    public int getList_9() {
        return list_9;
    }
    public void setList_9(int list_9) {
        this.list_9 = list_9;
    }
    public int getList_10() {
        return list_10;
    }
    public void setList_10(int list_10) {
        this.list_10 = list_10;
    }
    public int getList_11() {
        return list_11;
    }
    public void setList_11(int list_11) {
        this.list_11 = list_11;
    }
    public int getList_12() {
        return list_12;
    }
    public void setList_12(int list_12) {
        this.list_12 = list_12;
    }
    public int getList_13() {
        return list_13;
    }
    public void setList_13(int list_13) {
        this.list_13 = list_13;
    }
    public int getList_14() {
        return list_14;
    }
    public void setList_14(int list_14) {
        this.list_14 = list_14;
    }



    protected int tryChenge = 0;
    public int getTryChenge() {
        return tryChenge;
    }
    public void setTryChenge(int tryChenge) {
        this.tryChenge = tryChenge;
    }

    protected TextView text_3_inner, text_4_inner, text_5_inner, text_6_inner, text_7_inner, text_8_inner, text_9_inner, text_10_inner, text_11_inner, text_12_inner, text_13_inner, text_14_inner, text_sum, text_sum_inner;

    public Point viewLocatedAt(View v) {
        int[] location = new int[2];
        v.getLocationOnScreen(location);
        int x = location[0];
        int y = location[1];
        return new Point(x, y);
    } //определние координат

    List<String> taskList = new ArrayList<>();

    int nextLvl;
    public int getNextLvl() {
        return nextLvl;
    }
    public void setNextLvl(int nextLvl) {
        this.nextLvl = nextLvl;
    }
    SharedPreferences prefs = null;

    private int seconds = 0;
    private boolean running;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        dbHelper = new DataHelper(this);
        setTextFlag(1);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_start);
        chars_layout = findViewById(R.id.chars_layout);
        quest = findViewById(R.id.quest);

        lenght_plus_com = new ArrayList<>();
        lenght_minus_com = new ArrayList<>();


        pr1 = findViewById(R.id.pr1);
        pr2 = findViewById(R.id.pr2);
        pr3 = findViewById(R.id.pr3);
        pr4 = findViewById(R.id.pr4);
        pr5 = findViewById(R.id.pr5);
        pr6 = findViewById(R.id.pr6);
        pr7 = findViewById(R.id.pr7);
        pr8 = findViewById(R.id.pr8);
        pr9 = findViewById(R.id.pr9);
        pr10 = findViewById(R.id.pr10);
        pr11 = findViewById(R.id.pr11);
        pr12 = findViewById(R.id.pr12);
        pr13 = findViewById(R.id.pr13);
        pr14 = findViewById(R.id.pr14);
        starter = findViewById(R.id.starter);
        reset = findViewById(R.id.reset);
        faq = findViewById(R.id.faq);
        task = findViewById(R.id.task);
        lvlview = findViewById(R.id.lvlview);
        img_nextlvl = findViewById(R.id.img_nextlvl);
        progress = findViewById(R.id.progress);
        score = findViewById(R.id.score);
        textClock = findViewById(R.id.textClock);
        Colo = findViewById(R.id.Colo);
        mChronometer = findViewById(R.id.chronometer);

        textLvl = findViewById(R.id.textLvl);
        textScore = findViewById(R.id.textScore);
        tryChange = findViewById(R.id.tryChange);
        clock = findViewById(R.id.clock);

        char_1 = findViewById(R.id.char_1);
        char_2 = findViewById(R.id.char_2);
        char_3 = findViewById(R.id.char_3);
        char_4 = findViewById(R.id.char_4);
        char_5 = findViewById(R.id.char_5);
        char_6 = findViewById(R.id.char_6);
        char_7 = findViewById(R.id.char_7);
        char_8 = findViewById(R.id.char_8);
        char_9 = findViewById(R.id.char_9);
        char_10 = findViewById(R.id.char_10);
        char_11 = findViewById(R.id.char_11);
        char_12 = findViewById(R.id.char_12);
        char_13 = findViewById(R.id.char_13);
        char_14 = findViewById(R.id.char_14);


        GoneButnnons(); //все кнопки изначально не видимы

        thru_list_1 = new ArrayList<>();
        thru_list_2 = new ArrayList<>();
        thru_list_3 = new ArrayList<>();
        thru_list_4 = new ArrayList<>();

        Wrong_list_1 = new ArrayList<>();


        ChekOut = findViewById(R.id.ChekOut);

      bufferReadList = new ArrayList<>();

      Alfas = new ArrayList<>();
      WrongSwitch= new ArrayList<>();


        TYU = new ArrayList<>();
        ListReadBuffer = new ArrayList<>();
        ListBuffer = new ArrayList<>();


        progressBar = findViewById(R.id.progressBar);
        progressBar.setMax(5);

        score.setVisibility(GONE);
        lvlview.setVisibility(GONE);
        textClock.setVisibility(GONE);
        textLvl.setVisibility(GONE);
        textScore.setVisibility(GONE);
        tryChange.setVisibility(GONE);
        progressBar.setVisibility(GONE);
        prefs = android.preference.PreferenceManager.getDefaultSharedPreferences(this);


        SharedPreferences.Editor e = prefs.edit();
        e.apply();


        ControlWordsfinFail(); // читаем проверочные слова
        ReadWords(); // читаем ключевык
        Randomizator(); // разиваем на буквы


        Bundle bundle = getIntent().getExtras();
        if(bundle != null) {
            String income1 = bundle.getString("setSpeed_buttons");
            setSpeed_a(Integer.parseInt(income1));
            Log.d("SPEED2", ""+getSpeed_a());
        }

        ClockWork();
        createAdapterList();

    }


    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onStart() {
        super.onStart();
        try {
            LoadText();
//            Load_Lenght_plus();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ReadFromTxtWrong();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuinflater = getMenuInflater();
        menuinflater.inflate(R.menu.speed_menu, menu);
        return true;
    } // добавить МЕНЮ 1

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.action_settings){
            Intent openSettings  = new Intent(this, SetingsActivity.class);
            startActivity(openSettings);
            return  true;
        }
        return super.onOptionsItemSelected(item);
    } // отработка нажтий на МЕНЮ элементе 2

    public void ListXUpFull(){
        ListCoordinateX_1.add(ChekOut.getHeight()/8);
        ListCoordinateX_1.add(200);
        ListCoordinateX_1.add(200);
        ListCoordinateX_1.add(200);
        ListCoordinateX_1.add(200);
        ListCoordinateX_1.add(200);
    } //координаты для первого слова
    public void GoneButnnons(){


        pr1.setVisibility(GONE);
        pr2.setVisibility(GONE);
        pr3.setVisibility(GONE);
        pr4.setVisibility(GONE);
        pr5.setVisibility(GONE);
        pr6.setVisibility(GONE);
        pr7.setVisibility(GONE);
        pr8.setVisibility(GONE);
        pr9.setVisibility(GONE);
        pr10.setVisibility(GONE);
        pr11.setVisibility(GONE);
        pr12.setVisibility(GONE);
        pr13.setVisibility(GONE);
        pr14.setVisibility(GONE);

        char_1.setVisibility(GONE);
        char_2.setVisibility(GONE);
        char_3.setVisibility(GONE);
        char_4.setVisibility(GONE);
        char_5.setVisibility(GONE);
        char_6.setVisibility(GONE);
        char_7.setVisibility(GONE);
        char_8.setVisibility(GONE);
        char_9.setVisibility(GONE);
        char_10.setVisibility(GONE);
        char_11.setVisibility(GONE);
        char_12.setVisibility(GONE);
        char_13.setVisibility(GONE);
        char_14.setVisibility(GONE);


    } //убрать кнопки с экрана
    public void ShowButtons(){
        progressBar.setVisibility(VISIBLE);
        switch (numsofliteralsinword){
            case 11:
                pr1.setVisibility(VISIBLE);
                pr2.setVisibility(VISIBLE);
                pr3.setVisibility(VISIBLE);
                pr4.setVisibility(VISIBLE);
                pr5.setVisibility(VISIBLE);
                pr6.setVisibility(VISIBLE);
                pr7.setVisibility(VISIBLE);
                pr8.setVisibility(VISIBLE);
                pr9.setVisibility(VISIBLE);
                pr10.setVisibility(VISIBLE);
                pr11.setVisibility(VISIBLE);
                //--
                button1.start();
                button2.start();
                button3.start();
                button4.start();
                button5.start();
                button6.start();
                button7.start();
                button8.start();
                button9.start();
                button10.start();
                button11.start();
                break;
            case 14:
                pr1.setVisibility(VISIBLE);
                pr2.setVisibility(VISIBLE);
                pr3.setVisibility(VISIBLE);
                pr4.setVisibility(VISIBLE);
                pr5.setVisibility(VISIBLE);
                pr6.setVisibility(VISIBLE);
                pr7.setVisibility(VISIBLE);
                pr8.setVisibility(VISIBLE);
                pr9.setVisibility(VISIBLE);
                pr10.setVisibility(VISIBLE);
                pr11.setVisibility(VISIBLE);
                pr12.setVisibility(VISIBLE);
                pr13.setVisibility(VISIBLE);
                pr14.setVisibility(VISIBLE);
                //--
                button1.start();
                button2.start();
                button3.start();
                button4.start();
                button5.start();
                button6.start();
                button7.start();
                button8.start();
                button9.start();
                button10.start();
                button11.start();
                button12.start();
                button13.start();
                button14.start();
                break;

        }
        starter.setVisibility(GONE);
        char_1.setVisibility(VISIBLE);
        char_2.setVisibility(VISIBLE);
        char_3.setVisibility(VISIBLE);
        //--

    } // показ кнопок на экране
    public void ReadWords(){
        String str;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(getAssets().open("sevrallwords.txt")));

            this.list = new ArrayList<>();
            while ((str = reader.readLine()) != null) {
                if (!str.isEmpty()) {
                    list.add(str);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }// Читаем ключевые слова из файлика
    public void ControlWordsfinFail(){
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(getAssets().open("sevrallmanywords.txt")));
            String str1;
            this.listControl = new ArrayList<String>();
            while ((str1 = reader.readLine()) != null) {
                if (!str1.isEmpty()) {
                    listControl.add(str1);
                }
            }
//            this.ReadWords = list.toArray(new String[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }// Читаем проверочные слова из файлика
    public void Randomizator(){
        if (!list.isEmpty()) {
            this.indexWord = r.nextInt(list.size());
            this.word = list.get(indexWord);
            list.remove(word);
            setControl(this.word);  // <= ВАЖНО setControl должен быть тут!!!
            Log.d("QQW1", this.word);
        } else if (list.isEmpty()) {
            ReadWords(); //- заново
        }
        this.Original = this.word.split("");//разбив по буквам
        List<String> list = new ArrayList<String>(Arrays.asList(Original));
        list.removeAll(Arrays.asList("", null));
        this.OriginalWord = list.toArray(new String[0]);
        String[] Literals = OriginalWord;
        List<String> shuffle = Arrays.asList(Literals);
        Collections.shuffle(shuffle);
        shuffle.toArray(Literals);
        this.MixedleWord = Literals;
//        this.Control = this.word;
//        setControl(list.get(indexWord));
        this.numsofliteralsinword = MixedleWord.length;

    } //разбив слова на буквы
    protected void SetLiteralsonButtons(){
        switch (numsofliteralsinword) {
            case 11:
                pr1.setText(String.valueOf(MixedleWord[0]));
                pr2.setText(String.valueOf(MixedleWord[1]));
                pr3.setText(String.valueOf(MixedleWord[2]));
                pr4.setText(String.valueOf(MixedleWord[3]));
                pr5.setText(String.valueOf(MixedleWord[4]));
                pr6.setText(String.valueOf(MixedleWord[5]));
                pr7.setText(String.valueOf(MixedleWord[6]));
                pr8.setText(String.valueOf(MixedleWord[7]));
                pr9.setText(String.valueOf(MixedleWord[8]));
                pr10.setText(String.valueOf(MixedleWord[9]));
                pr11.setText(String.valueOf(MixedleWord[10]));
                pr12.setVisibility(GONE);
                pr13.setVisibility(GONE);
                pr14.setVisibility(GONE);
                break;
            case 14:
                pr12.setVisibility(VISIBLE);
                pr13.setVisibility(VISIBLE);
                pr14.setVisibility(VISIBLE);
                pr1.setText(String.valueOf(MixedleWord[0]));
                pr2.setText(String.valueOf(MixedleWord[1]));
                pr3.setText(String.valueOf(MixedleWord[2]));
                pr4.setText(String.valueOf(MixedleWord[3]));
                pr5.setText(String.valueOf(MixedleWord[4]));
                pr6.setText(String.valueOf(MixedleWord[5]));
                pr7.setText(String.valueOf(MixedleWord[6]));
                pr8.setText(String.valueOf(MixedleWord[7]));
                pr9.setText(String.valueOf(MixedleWord[8]));
                pr10.setText(String.valueOf(MixedleWord[9]));
                pr11.setText(String.valueOf(MixedleWord[10]));
                pr12.setText(String.valueOf(MixedleWord[11]));
                pr13.setText(String.valueOf(MixedleWord[12]));
                pr14.setText(String.valueOf(MixedleWord[13]));
                break;
        }
    } //назначаем буквы на кнопки
    public void onClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(GameStart.this);
        builder.setTitle("     Инструкция")
                .setMessage("По экрану движутся кнопки, нажимая на них нужно собрать слово" + "\n"  +
                        "3 буквы +1 очко " + "\n"  +
                        "4 буквы +2 очка" + "\n"  +
                        "5 букв +3 очка" + "\n"  +
                        "6 букв и больше +4 очка " + "\n"  +
                        "каждое не правильное слово -1 очко " + "\n"  +
                         "Вы мсжете поменять  набор букв в любой момент. Это стоит -1 очко замены." + "\n"  +
                                "Каждое очко замены дается при достижения новый ачивки и нового уровня"
                        )
                .setCancelable(false)
                .setNegativeButton("Все понятно, создатель этого приложения гений!",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
        AlertDialog alert = builder.create();
        alert.show();
    } //Всплывающая инструкция

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void LetsGo(View v){

        score.setText(""+getCounter());
        textClock.setText(""+getTryChenge());
        lvlview.setText(""+getStepOnNextLvl());

        ReadfromDB();
         ReadfromDB_lenght();

        score.setText(""+getCounter());
        textClock.setText(""+getTryChenge());
        lvlview.setText(""+getStepOnNextLvl());


        score.setVisibility(VISIBLE);
        lvlview.setVisibility(VISIBLE);
        textClock.setVisibility(VISIBLE);
        textLvl.setVisibility(VISIBLE);
        textScore.setVisibility(VISIBLE);
        tryChange.setVisibility(VISIBLE);


        ListXUpFull(); // заполняем листы координат
//        ControlWordsfinFail(); // читаем проверочные слова
//        ReadWords(); // читаем ключевык
//        Randomizator(); // разиваем на буквы
        GoneButnnons(); //все кнопки изначально не видимы

        SetLiteralsonButtons(); //установка букв на слова
        Creates(); //активация и движеение кнопок

        ShowButtons();
        starter.setVisibility(GONE);

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
               f001 = viewLocatedAt(ChekOut).y - (ChekOut.getHeight()/8);
                LineY_1.clear();
                LineY_1.add(f001);
            }
        }, 500);

        thru_list_1.clear();
        thru_list_2.clear();
        thru_list_3.clear();
        thru_list_4.clear();

        Wrong_list_1.clear();


        progressBar.setProgress(getCounter());

        try {
            LoadText();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ReadFromTxtWrong();

        onClickStart();//старт часов
    }  // СТАРТ, часы

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void NewWord(){
        starter.setVisibility(GONE);
        ControlWordsfinFail(); // читаем проверочные слова
        ReadWords(); // читаем ключевык
        Randomizator(); // разиваем на буквы
        SetLiteralsonButtons(); //установка букв на слова
        ListXUpFull(); // заполняем листы координат
        ShowButtons(); // услвие появление кнопок зависитот кол-ва букв в слове
        Creates(); //активация и движеение кнопок
    } // следующее слово
    @RequiresApi(api = Build.VERSION_CODES.O)
    public void ResTart(View v){
        EneblendButtonsAffterPress();
        if (getTryChenge()> 0){
            reset.setEnabled(true);
            NewWord();
            setTryChenge(getTryChenge()-1);
            Toast.makeText(this, "Слово сменилось", Toast.LENGTH_SHORT).show();
        } else if (getTryChenge()<1){
            Toast.makeText(this, "Нет попыток, добудте еще ачивку", Toast.LENGTH_SHORT).show();
        }
        textClock.setText(""+getTryChenge());//2

    }  //Включить новое слово
    @SuppressLint("SetTextI18n")

    protected void HowScore(int A){
        switch (A){
            case 2:
                setCounter(getCounter()+0);
                break;
            case 3:
                setCounter(getCounter()+1);
                break;
            case 4:
                setCounter(getCounter()+2);
                break;
            case 5:
                setCounter(getCounter()+3);
                break;
            case 6:
                setCounter(getCounter()+4);
                break;
            case 7:
                setCounter(getCounter()+4);
                break;
            case 8:
                setCounter(getCounter()+4);
                break;
            case 9:
                setCounter(getCounter()+4);
                break;
            case 10:
                setCounter(getCounter()+4);
                break;
        }

    }//подсчет очков за Ачивки
    protected void HowLenght (int incom1){
        switch (incom1){
            case 2:
                setList_2(getList_2()+0);
                break;
            case 3:
                setList_3(getList_3()+1);
                break;
            case 4:
                setList_4(getList_4()+1);
                break;
            case 5:
                setList_5(getList_5()+1);
                break;
            case 6:
                setList_6(getList_6()+1);
                break;
            case 7:
                setList_7(getList_7()+1);
                break;
            case 8:
                setList_8(getList_8()+1);
                break;
            case 9:
                setList_9(getList_9()+1);
                break;
            case 10:
                setList_10(getList_10()+1);
                break;
            case 11:
                setList_11(getList_10()+1);
                break;
            case 12:
                setList_12(getList_10()+1);
                break;
            case 13:
                setList_13(getList_10()+1);
                break;
            case 14:
                setList_14(getList_10()+1);
                break;
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    protected void howLenght_plus(String keyWord_lenght){
//        String[] listWord_lenght = MainListWord.toArray(new String[0]);
//        String keyWord_lenght = (String.join("", listWord_lenght));
                lenght_plus_com.add(keyWord_lenght);
                setLenght_plus(supportClass.CountCorrectSeqLen(lenght_plus_com));
                    lenght_minus_com.add(keyWord_lenght);
                    setLenght_minus_minus(supportClass.countWordMinus(lenght_minus_com));

                    Log.d("uuui_plus", String.valueOf(getLenght_plus()));
    } //Если я читаю это секйчас, пожалуйста, не думай зачем я это все писал. Главное, что это работает

    protected void howLenght_minus(String keyWord_lenght){
        lenght_minus_com.add(keyWord_lenght);
        setLenght_minus_minus(supportClass.countWordMinus(lenght_minus_com));

        Log.d("uuui_minus", String.valueOf(getLenght_minus_minus()));
    } //Если я читаю это секйчас, пожалуйста, не думай зачем я это все писа


    @SuppressLint("SetTextI18n")
    @RequiresApi(api = Build.VERSION_CODES.O)
    public void Chek_1(View v){

//анимация альфа канала (прозрачности от 0 до 1)
        Animation animation = new AlphaAnimation(0.0f, 1.0f);
//длительность анимации 1/10 секунды
        animation.setDuration(300);
//сдвижка начала анимации (с середины)
        animation.setStartOffset(50);
//режим повтора - сначала или в обратном порядке
        animation.setRepeatMode(Animation.REVERSE);
//режим повтора (бесконечно)
       animation.setRepeatCount(0);


//анимация альфа канала (прозрачности от 0 до 1)
        Animation animation2 = new TranslateAnimation(-10, 30, 0, 30);
//длительность анимации 1/10 секунды
        animation2.setDuration(300);
//сдвижка начала анимации (с середины)
        animation2.setStartOffset(50);
//режим повтора - сначала или в обратном порядке
        animation2.setRepeatMode(Animation.REVERSE);
//режим повтора (бесконечно
        animation2.setInterpolator(new BounceInterpolator());
        animation2.setRepeatCount(1);

        String[] ArrayListWord = MainListWord.toArray(new String[0]);
        String KeyWord = (String.join("", ArrayListWord));

       // Toast.makeText(this, KeyWord, Toast.LENGTH_SHORT).show();
        if (listControl.contains(KeyWord) && !listBuffer.contains(KeyWord) && !Switch_answer().contains(KeyWord)) {
            ListXUpFull();
            HowScore(ArrayListWord.length); // Передача ОЧКОВ
            HowLenght(ArrayListWord.length);
                    howLenght_plus(KeyWord);
                    howLenght_minus(KeyWord);
            Switch_answer().add(KeyWord);
            setCounter(getCounter()+1);
            setExp(getExp()+4);
            if (progressBar.getProgress() >= progressBar.getMax()) {
                ShowNewLvl();
                setFlag(1);
                int newlvls =0;
                newlvls = newlvls+1;
                setNextLvl(newlvls);
                setExp(getExp()-2);
                switch(progressBar.getMax()) {
                    case 5:
                        this.nextLvl = 1;
                        break;
                    case 8:
                        this.nextLvl = 2;
                        break;
                    case 15:
                        this.nextLvl = 3;
                        break;
                    case 21:
                        this.nextLvl = 4;
                        break;
                    case 32:
                        this.nextLvl = 5;
                        break;
                    case 45:
                        this.nextLvl = 6;
                        break;
                    case 60:
                        this.nextLvl = 7;
                        break;
                    case 80:
                        this.nextLvl = 8;
                        break;
                    case 100:
                        this.nextLvl = 9;
                        break;
                    case 150:
                        this.nextLvl = 10;
                        break;
                }
            }
            ActivatePrBar();
            ProgressBarNextLvl();
            ChekOut.startAnimation(animation);
        } else if (listBuffer.contains(KeyWord)){
            ListXUpFull();
            setCounter(getCounter()-1);
            setExp(getExp()-2);
            ActivatePrBar();
            ProgressBarNextLvl();
            Toast.makeText(this, "Повтор слова, такое уже есть", Toast.LENGTH_SHORT).show();
            Wrong_Switch_answer().add(KeyWord);
            ChekOut.startAnimation(animation2);
        } else{
            ListXUpFull();
            setCounter(getCounter()-1);
            setExp(getExp()-1);
            ActivatePrBar();
            ProgressBarNextLvl();
            Wrong_Switch_answer().add(KeyWord);
            ChekOut.startAnimation(animation2);
        }
        EneblendButtonsAffterPress();
        listBuffer.add(KeyWord);
        MainListWord.removeAll(MainListWord);

        MainListWord.clear();
        char_1.setText("");
        char_2.setText("");
        char_3.setText("");
        char_4.setText("");
        char_5.setText("");
        char_6.setText("");
        char_7.setText("");
        char_8.setText("");
        char_9.setText("");
        char_10.setText("");
        char_11.setText("");
        char_12.setText("");
        char_13.setText("");
        char_13.setText("");

        ChekOut.setText("Собери слово");
        supportClass.ShowTaskWelDone(taskList);

        switch(supportClass.taskDone.size()){
            case 1:
                setTryChenge(getTryChenge()+1);
                setCounter(getCounter()+2);
                break;
            case 2:
                setTryChenge(getTryChenge()+1);
                setCounter(getCounter()+2);
                break;
            case 3:
                setTryChenge(getTryChenge()+1);
                setCounter(getCounter()+2);
                break;
            case 4:
                setTryChenge(getTryChenge()+1);
                setCounter(getCounter()+2);
                break;
            case 5:
                setTryChenge(getTryChenge()+1);
                setCounter(getCounter()+2);
                break;
            case 6:
                setTryChenge(getTryChenge()+1);
                setCounter(getCounter()+2);
                break;
        }


        score.setText(""+getCounter()); // ФИНАЛЬНЫЕ данные очки
        textClock.setText(""+getTryChenge());// ФИНАЛЬНЫЕ данные попыток смены
        lvlview.setText(""+getStepOnNextLvl()); // ФИНАЛЬНЫЕ данные уровень

        AddDB();
        SaveText();
        WriteWrong();
            AddDB_lenght();

        howAchivites();


        char_4.setVisibility(GONE);
        char_5.setVisibility(GONE);
        char_6.setVisibility(GONE);
        char_7.setVisibility(GONE);
        char_8.setVisibility(GONE);
        char_9.setVisibility(GONE);
        char_10.setVisibility(GONE);
        char_11.setVisibility(GONE);
        char_12.setVisibility(GONE);
        char_13.setVisibility(GONE);
        char_14.setVisibility(GONE);


    } //проверка


    //------------таймер
    public void ClockWork(){

        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds/3600;
                int minutes = (seconds%3600)/60;
                int secs = seconds%60;
                String time = String.format(Locale.getDefault(),
                        "%d:%02d:%02d", hours, minutes, secs);
                clock.setText(time);
                if (running) {
                    seconds++;
                }
                handler.postDelayed(this, 1000);
            }
        });
    }
    public void onClickStart() {
        running = true;

    } //старт
    public void onClickStop() {
        running = false;
    } //стоп, пауза
    //-------------

    protected void ActivatePrBar () {
        if (getFlag()==1){
            setFlag(0);
        }
    } //работа с прогрессбаром

    int inProgressWeaTrust;
    public void ProgressBarNextLvl(){

        inProgressWeaTrust = getCounter();
        progressBar.setProgress(inProgressWeaTrust);
        if (progressBar.getProgress() == progressBar.getMax()){
            switch (progressBar.getMax()){
                case 5:
                    setStepOnNextLvl(1);
                    setTryChenge(getTryChenge()+1);
                    progressBar.setMax(8);
                    break;
                case 8:
                    setStepOnNextLvl(2);
                    setTryChenge(getTryChenge()+1);
                    progressBar.setMax(15);
                    break;
                case 15:
                    progressBar.setMax(21);
                    setStepOnNextLvl(3);
                    break;
                case 21:
                    progressBar.setMax(32);
                    setStepOnNextLvl(4);
                    break;
                case 32:
                    progressBar.setMax(45);
                    setStepOnNextLvl(5);
                    break;
                case 45:
                    progressBar.setMax(60);
                    setStepOnNextLvl(6);
                    break;
                case 60:
                    progressBar.setMax(80);
                    setStepOnNextLvl(7);
                    break;
                case 80:
                    progressBar.setMax(100);
                    setStepOnNextLvl(8);
                    break;
                case 100:
                    progressBar.setMax(150);
                    setStepOnNextLvl(9);
                    break;
                case 150:
                    progressBar.setMax(200);
                    setStepOnNextLvl(10);
                    break;
            }
            ShowNewLvl();
            progressBar.setProgress(0);

        } // новый уровень

    } // добавление прогресс бара
    protected void ShowNewLvl(){

        ObjectAnimator scaleXAnimation = ObjectAnimator.ofFloat(img_nextlvl, "scaleX", 0.3f, 2.5f);
        scaleXAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        scaleXAnimation.setDuration(1900);
        ObjectAnimator scaleYAnimation = ObjectAnimator.ofFloat(img_nextlvl, "scaleY", 0.3f, 2.5f);
        scaleYAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        scaleYAnimation.setDuration(1900);
        ObjectAnimator alphaAnimation = ObjectAnimator.ofFloat(img_nextlvl, "alpha", 1F, 0F);
        alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        alphaAnimation.setDuration(2500);


        AnimatorSet animationSet = new AnimatorSet();
        animationSet.play(scaleXAnimation).with(scaleYAnimation).with(alphaAnimation);
        animationSet.start();
    } //показать уведомление о новом уровне
    protected void EneblendButtonsAffterPress(){
        pr1.setEnabled(true);
        pr1.setBackgroundResource(R.drawable.forlessbutton);
        pr2.setEnabled(true);
        pr2.setBackgroundResource(R.drawable.forlessbutton);
        pr3.setEnabled(true);
        pr3.setBackgroundResource(R.drawable.forlessbutton);
        pr4.setEnabled(true);
        pr4.setBackgroundResource(R.drawable.forlessbutton);
        pr5.setEnabled(true);
        pr5.setBackgroundResource(R.drawable.forlessbutton);
        pr6.setEnabled(true);
        pr6.setBackgroundResource(R.drawable.forlessbutton);
        pr7.setEnabled(true);
        pr7.setBackgroundResource(R.drawable.forlessbutton);
        pr8.setEnabled(true);
        pr8.setBackgroundResource(R.drawable.forlessbutton);
        pr9.setEnabled(true);
        pr9.setBackgroundResource(R.drawable.forlessbutton);
        pr10.setEnabled(true);
        pr10.setBackgroundResource(R.drawable.forlessbutton);
        pr11.setEnabled(true);
        pr11.setBackgroundResource(R.drawable.forlessbutton);
        pr12.setEnabled(true);
        pr12.setBackgroundResource(R.drawable.forlessbutton);
        pr13.setEnabled(true);
        pr13.setBackgroundResource(R.drawable.forlessbutton);
        pr14.setEnabled(true);
        pr14.setBackgroundResource(R.drawable.forlessbutton);
    } //кнопки снова активны и имеют исходный стиль

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void Creates(){



        button1 = ObjectAnimator.ofPropertyValuesHolder(pr1,
                PropertyValuesHolder.ofFloat("x", 0, 850),
                PropertyValuesHolder.ofFloat("y", 140, 1050));

        button1.setDuration(6000 +getSpeed_a());
        button1.setRepeatCount(ObjectAnimator.INFINITE);
        button1.setRepeatMode(ObjectAnimator.REVERSE);

//        button1.start();
//2 кнопка
        button2 = ObjectAnimator.ofPropertyValuesHolder(pr2,
                PropertyValuesHolder.ofFloat("x", 200, 400),
                PropertyValuesHolder.ofFloat("y", 140, 1050));
        button2.setDuration(6300+getSpeed_a());
        button2.setRepeatCount(ObjectAnimator.INFINITE);
        button2.setRepeatMode(ObjectAnimator.REVERSE);
//        button2.start();
//3 кнопка
        button3 = ObjectAnimator.ofPropertyValuesHolder(pr3,
                PropertyValuesHolder.ofFloat("x", 0, 910),
                PropertyValuesHolder.ofFloat("y", 140, 140));
        button3.setDuration(7500+getSpeed_a());
        button3.setRepeatCount(ObjectAnimator.INFINITE);
        button3.setRepeatMode(ObjectAnimator.REVERSE);
//        button3.start();
//4 кнопка
        button4 = ObjectAnimator.ofPropertyValuesHolder(pr4,
                PropertyValuesHolder.ofFloat("x", 0, 910),
                PropertyValuesHolder.ofFloat("y", 500, 500));
        button4.setDuration(8000+getSpeed_a());
        button4.setRepeatCount(ObjectAnimator.INFINITE);
        button4.setRepeatMode(ObjectAnimator.REVERSE);
//        button4.start();
//5 кнопка
        button5 = ObjectAnimator.ofPropertyValuesHolder(pr5,
                PropertyValuesHolder.ofFloat("x", 0, 910),
                PropertyValuesHolder.ofFloat("y", 900, 900));
        button5.setDuration(5300+getSpeed_a());
        button5.setRepeatCount(ObjectAnimator.INFINITE);
        button5.setRepeatMode(ObjectAnimator.REVERSE);
//        button5.start();
//6 кнопка
        button6 = ObjectAnimator.ofPropertyValuesHolder(pr6,
                PropertyValuesHolder.ofFloat("x", 910, 0),
                PropertyValuesHolder.ofFloat("y", 300, 300));
        button6.setDuration(5600 +getSpeed_a());
        button6.setRepeatCount(ObjectAnimator.INFINITE);
        button6.setRepeatMode(ObjectAnimator.REVERSE);
//        button6.start();
//7 кнопка
        button7 = ObjectAnimator.ofPropertyValuesHolder(pr7,
                PropertyValuesHolder.ofFloat("x", 910, 0),
                PropertyValuesHolder.ofFloat("y", 700, 700));
        button7.setDuration(4400 +getSpeed_a());
        button7.setRepeatCount(ObjectAnimator.INFINITE);
        button7.setRepeatMode(ObjectAnimator.REVERSE);
//        button7.start();
//8 кнопка
        button8 = ObjectAnimator.ofPropertyValuesHolder(pr8,
                PropertyValuesHolder.ofFloat("x", 200, 650),
                PropertyValuesHolder.ofFloat("y", 1050, 140));
        button8.setDuration(3900 +getSpeed_a());
        button8.setRepeatCount(ObjectAnimator.INFINITE);
        button8.setRepeatMode(ObjectAnimator.REVERSE);
//        button8.start();
//9 кнопка не настроил
        button9 = ObjectAnimator.ofPropertyValuesHolder(pr9,
                PropertyValuesHolder.ofFloat("x", 800, 800),
                PropertyValuesHolder.ofFloat("y", 1050, 140));
        button9.setDuration(4100 +getSpeed_a());
        button9.setRepeatCount(ObjectAnimator.INFINITE);
        button9.setRepeatMode(ObjectAnimator.REVERSE);
//        button9.start();
//10 кнопка
        button10 = ObjectAnimator.ofPropertyValuesHolder(pr10,
                PropertyValuesHolder.ofFloat("x", 0, 250),
                PropertyValuesHolder.ofFloat("y", 1050, 140));
        button10.setDuration(4500 +getSpeed_a());
        button10.setRepeatCount(ObjectAnimator.INFINITE);
        button10.setRepeatMode(ObjectAnimator.REVERSE);
//        button10.start();
//11 кнопка
        button11 = ObjectAnimator.ofPropertyValuesHolder(pr11,
                PropertyValuesHolder.ofFloat("x", 910, 100),
                PropertyValuesHolder.ofFloat("y", 140, 950));
        button11.setDuration(5700 +getSpeed_a());
        button11.setRepeatCount(ObjectAnimator.INFINITE);
        button11.setRepeatMode(ObjectAnimator.REVERSE);
//        button11.start();
//12 кнопка
        button12 = ObjectAnimator.ofPropertyValuesHolder(pr12,
                PropertyValuesHolder.ofFloat("x", 700, 400),
                PropertyValuesHolder.ofFloat("y", 140, 1050));
        button12.setDuration(3600 +getSpeed_a());
        button12.setRepeatCount(ObjectAnimator.INFINITE);
        button12.setRepeatMode(ObjectAnimator.REVERSE);
//        button12.start();

//13 кнопка
        button13 = ObjectAnimator.ofPropertyValuesHolder(pr13,
                PropertyValuesHolder.ofFloat("x", 910, 0),
                PropertyValuesHolder.ofFloat("y", 1100, 1050));
        button13.setDuration(5100 +getSpeed_a());
        button13.setRepeatCount(ObjectAnimator.INFINITE);
        button13.setRepeatMode(ObjectAnimator.REVERSE);
//        button13.start();
//14 кнопка
        button14 = ObjectAnimator.ofPropertyValuesHolder(pr14,
                PropertyValuesHolder.ofFloat("x", 500, 500),
                PropertyValuesHolder.ofFloat("y", 140, 1050));
        button14.setDuration(4800 +getSpeed_a());
        button14.setRepeatCount(ObjectAnimator.INFINITE);
        button14.setRepeatMode(ObjectAnimator.REVERSE);
//        button14.start();
    } //движение кнопок
    protected void SwitchTextField(){
//        switch(getTextFlag()){
//            case 1:
//                textButton1.setText(String.valueOf(MainListWord));
//                break;
//            case 2:
//                textButton2.setText(String.valueOf(MainListWord));
//                break;
//            case 3:
//                textButton3.setText(String.valueOf(MainListWord));
//                break;
//            case 4:
//                textButton4.setText(String.valueOf(MainListWord));
//                break;
//            case 5:
//                textButton5.setText(String.valueOf(MainListWord));
//                break;
//            case 6:
//                textButton6.setText(String.valueOf(MainListWord));
//                break;
//            case 7:
//                textButton7.setText(String.valueOf(MainListWord));
//                break;
//            case 8:
//                textButton8.setText(String.valueOf(MainListWord));
//                break;
//            case 9:
//                textButton9.setText(String.valueOf(MainListWord));
//                break;
//            case 10:
//                textButton10.setText(String.valueOf(MainListWord));
//                break;
//        }


// Старое назначение букв на выход     // ста

        // старое назначение букв на вывод на виюшку


            if (MainListWord.size() == 1){
                char_1.setText(MainListWord.get(0));
                char_2.setText("");
                char_3.setText("");
                char_4.setText("");
                char_5.setText("");
                char_6.setText("");
                char_7.setText("");
                char_8.setText("");
                char_9.setText("");
                char_10.setText("");
                char_11.setText("");
                char_12.setText("");
                char_13.setText("");
                char_13.setText("");
            } else if (MainListWord.size() == 2){
                char_1.setText(MainListWord.get(0));
                char_2.setText(MainListWord.get(1));
                char_3.setText("");
                char_4.setText("");
                char_5.setText("");
                char_6.setText("");
                char_7.setText("");
                char_8.setText("");
                char_9.setText("");
                char_10.setText("");
                char_11.setText("");
                char_12.setText("");
                char_13.setText("");
                char_13.setText("");
            } else if (MainListWord.size() == 3){
                char_1.setText(MainListWord.get(0));
                char_2.setText(MainListWord.get(1));
                char_3.setText(MainListWord.get(2));
                char_4.setText("");
                char_5.setText("");
                char_6.setText("");
                char_7.setText("");
                char_8.setText("");
                char_9.setText("");
                char_10.setText("");
                char_11.setText("");
                char_12.setText("");
                char_13.setText("");
                char_13.setText("");
                char_4.setVisibility(VISIBLE);
            } else if (MainListWord.size() == 4){
                char_1.setText(MainListWord.get(0));
                char_2.setText(MainListWord.get(1));
                char_3.setText(MainListWord.get(2));
                char_4.setText(MainListWord.get(3));
                char_5.setText("");
                char_6.setText("");
                char_7.setText("");
                char_8.setText("");
                char_9.setText("");
                char_10.setText("");
                char_11.setText("");
                char_12.setText("");
                char_13.setText("");
                char_13.setText("");
                char_5.setVisibility(VISIBLE);
            } else if (MainListWord.size() == 5){
                char_1.setText(MainListWord.get(0));
                char_2.setText(MainListWord.get(1));
                char_3.setText(MainListWord.get(2));
                char_4.setText(MainListWord.get(3));
                char_5.setText(MainListWord.get(4));
                char_6.setText("");
                char_7.setText("");
                char_8.setText("");
                char_9.setText("");
                char_10.setText("");
                char_11.setText("");
                char_12.setText("");
                char_13.setText("");
                char_13.setText("");
                char_6.setVisibility(VISIBLE);
            } else if (MainListWord.size() == 6){
                char_1.setText(MainListWord.get(0));
                char_2.setText(MainListWord.get(1));
                char_3.setText(MainListWord.get(2));
                char_4.setText(MainListWord.get(3));
                char_5.setText(MainListWord.get(4));
                char_6.setText(MainListWord.get(5));
                char_7.setText("");
                char_8.setText("");
                char_9.setText("");
                char_10.setText("");
                char_11.setText("");
                char_12.setText("");
                char_13.setText("");
                char_13.setText("");
                char_7.setVisibility(VISIBLE);
            } else if (MainListWord.size() == 7){
                char_1.setText(MainListWord.get(0));
                char_2.setText(MainListWord.get(1));
                char_3.setText(MainListWord.get(2));
                char_4.setText(MainListWord.get(3));
                char_5.setText(MainListWord.get(4));
                char_6.setText(MainListWord.get(5));
                char_7.setText(MainListWord.get(6));
                char_8.setText("");
                char_9.setText("");
                char_10.setText("");
                char_11.setText("");
                char_12.setText("");
                char_13.setText("");
                char_13.setText("");
                char_8.setVisibility(VISIBLE);
            } else if (MainListWord.size() == 8){
                char_1.setText(MainListWord.get(0));
                char_2.setText(MainListWord.get(1));
                char_3.setText(MainListWord.get(2));
                char_4.setText(MainListWord.get(3));
                char_5.setText(MainListWord.get(4));
                char_6.setText(MainListWord.get(5));
                char_7.setText(MainListWord.get(6));
                char_8.setText(MainListWord.get(7));
                char_9.setText("");
                char_10.setText("");
                char_11.setText("");
                char_12.setText("");
                char_13.setText("");
                char_13.setText("");
                char_9.setVisibility(VISIBLE);
            } else if (MainListWord.size() == 9){
                char_1.setText(MainListWord.get(0));
                char_2.setText(MainListWord.get(1));
                char_3.setText(MainListWord.get(2));
                char_4.setText(MainListWord.get(3));
                char_5.setText(MainListWord.get(4));
                char_6.setText(MainListWord.get(5));
                char_7.setText(MainListWord.get(6));
                char_8.setText(MainListWord.get(7));
                char_9.setText(MainListWord.get(8));
                char_10.setText("");
                char_11.setText("");
                char_12.setText("");
                char_13.setText("");
                char_13.setText("");
                char_10.setVisibility(VISIBLE);
            }else if (MainListWord.size() == 10){
                char_1.setText(MainListWord.get(0));
                char_2.setText(MainListWord.get(1));
                char_3.setText(MainListWord.get(2));
                char_4.setText(MainListWord.get(3));
                char_5.setText(MainListWord.get(4));
                char_6.setText(MainListWord.get(5));
                char_7.setText(MainListWord.get(6));
                char_8.setText(MainListWord.get(7));
                char_9.setText(MainListWord.get(8));
                char_10.setText(MainListWord.get(9));
                char_11.setText("");
                char_12.setText("");
                char_13.setText("");
                char_13.setText("");
                if (numsofliteralsinword > 10) {
                    char_11.setVisibility(VISIBLE);
                }
            } else if (MainListWord.size() == 11){
                char_1.setText(MainListWord.get(0));
                char_2.setText(MainListWord.get(1));
                char_3.setText(MainListWord.get(2));
                char_4.setText(MainListWord.get(3));
                char_5.setText(MainListWord.get(4));
                char_6.setText(MainListWord.get(5));
                char_7.setText(MainListWord.get(6));
                char_8.setText(MainListWord.get(7));
                char_9.setText(MainListWord.get(8));
                char_10.setText(MainListWord.get(9));
                char_11.setText(MainListWord.get(10));
                char_12.setText("");
                char_13.setText("");
                char_13.setText("");
                if (numsofliteralsinword == 14) {
                    char_12.setVisibility(VISIBLE);
                }
            } else if (MainListWord.size() == 12){
                char_1.setText(MainListWord.get(0));
                char_2.setText(MainListWord.get(1));
                char_3.setText(MainListWord.get(2));
                char_4.setText(MainListWord.get(3));
                char_5.setText(MainListWord.get(4));
                char_6.setText(MainListWord.get(5));
                char_7.setText(MainListWord.get(6));
                char_8.setText(MainListWord.get(7));
                char_9.setText(MainListWord.get(8));
                char_10.setText(MainListWord.get(9));
                char_11.setText(MainListWord.get(10));
                char_12.setText(MainListWord.get(11));
                char_13.setText("");
                char_13.setText("");
                if (numsofliteralsinword == 14) {
                    char_13.setVisibility(VISIBLE);
                }
            } else if (MainListWord.size() == 13){
                char_1.setText(MainListWord.get(0));
                char_2.setText(MainListWord.get(1));
                char_3.setText(MainListWord.get(2));
                char_4.setText(MainListWord.get(3));
                char_5.setText(MainListWord.get(4));
                char_6.setText(MainListWord.get(5));
                char_7.setText(MainListWord.get(6));
                char_8.setText(MainListWord.get(7));
                char_9.setText(MainListWord.get(8));
                char_10.setText(MainListWord.get(9));
                char_11.setText(MainListWord.get(10));
                char_12.setText(MainListWord.get(11));
                char_13.setText(MainListWord.get(12));
                char_13.setText("");
                if (numsofliteralsinword == 14) {
                    char_14.setVisibility(VISIBLE);
                }
            } else if (MainListWord.size() == 14){
                char_1.setText(MainListWord.get(0));
                char_2.setText(MainListWord.get(1));
                char_3.setText(MainListWord.get(2));
                char_4.setText(MainListWord.get(3));
                char_5.setText(MainListWord.get(4));
                char_6.setText(MainListWord.get(5));
                char_7.setText(MainListWord.get(6));
                char_8.setText(MainListWord.get(7));
                char_9.setText(MainListWord.get(8));
                char_10.setText(MainListWord.get(9));
                char_11.setText(MainListWord.get(10));
                char_12.setText(MainListWord.get(11));
                char_13.setText(MainListWord.get(12));
                char_13.setText(MainListWord.get(13));
            }

    } // изменение флага печати текста

    public void ClickButton1(View v){

        countID++;
        MainListWord.add(pr1.getText().toString());
        pr1.setBackgroundResource(R.drawable.acceptbutton);
        pr1.setEnabled(false);

        SwitchTextField();
        ListXUpFull();

    } //кнопка 1
    public void ClickButton2(View v){

        countID++;
        MainListWord.add(pr2.getText().toString());
        pr2.setBackgroundResource(R.drawable.acceptbutton);
        pr2.setEnabled(false);

        SwitchTextField();
        ListXUpFull();
    } //кнопка 2
    public void ClickButton3(View v){
        countID++;
        MainListWord.add(pr3.getText().toString());
        pr3.setBackgroundResource(R.drawable.acceptbutton);
        pr3.setEnabled(false);

        SwitchTextField();
        ListXUpFull();

    } //кнопка 3
    public void ClickButton4(View v){
        countID++;
        MainListWord.add(pr4.getText().toString());
        pr4.setBackgroundResource(R.drawable.acceptbutton);
        pr4.setEnabled(false);

        SwitchTextField();
        ListXUpFull();
    } //кнопка 4
    public void ClickButton5(View v){
        countID++;
        MainListWord.add(pr5.getText().toString());
        pr5.setBackgroundResource(R.drawable.acceptbutton);
        pr5.setEnabled(false);

        SwitchTextField();
        ListXUpFull();
    } //кнопка 5
    public void ClickButton6(View v){
        countID++;
        MainListWord.add(pr6.getText().toString());
        pr6.setBackgroundResource(R.drawable.acceptbutton);
        pr6.setEnabled(false);

        SwitchTextField();
        ListXUpFull();
    } //кнопка 6
    public void ClickButton7(View v){
        countID++;
        MainListWord.add(pr7.getText().toString());
        pr7.setBackgroundResource(R.drawable.acceptbutton);
        pr7.setEnabled(false);

        SwitchTextField();
        ListXUpFull();
    } //кнопка 7
    public void ClickButton8(View v){
        countID++;
        MainListWord.add(pr8.getText().toString());
        pr8.setBackgroundResource(R.drawable.acceptbutton);
        pr8.setEnabled(false);

        SwitchTextField();
        ListXUpFull();
    } //кнопка 8
    public void ClickButton9(View v){
        countID++;
        MainListWord.add(pr9.getText().toString());
        pr9.setBackgroundResource(R.drawable.acceptbutton);
        pr9.setEnabled(false);

        SwitchTextField();
        ListXUpFull();
    } //кнопка 9
    public void ClickButton10(View v){
        countID++;
        MainListWord.add(pr10.getText().toString());
        pr10.setBackgroundResource(R.drawable.acceptbutton);
        pr10.setEnabled(false);

        SwitchTextField();
        ListXUpFull();
    } //кнопка 10
    public void ClickButton11(View v){
        countID++;
        MainListWord.add(pr11.getText().toString());
        pr11.setBackgroundResource(R.drawable.acceptbutton);
        pr11.setEnabled(false);

        SwitchTextField();
        ListXUpFull();
    } //кнопка 11
    public void ClickButton12(View v){
        countID++;
        MainListWord.add(pr12.getText().toString());
        pr12.setBackgroundResource(R.drawable.acceptbutton);
        pr12.setEnabled(false);

        SwitchTextField();
        ListXUpFull();
    } //кнопка 12
    public void ClickButton13(View v){
        countID++;
        MainListWord.add(pr13.getText().toString());
        pr13.setBackgroundResource(R.drawable.acceptbutton);
        pr13.setEnabled(false);

        SwitchTextField();
        ListXUpFull();
    } //кнопка 13
    public void ClickButton14(View v){
        countID++;
        MainListWord.add(pr14.getText().toString());
        pr14.setBackgroundResource(R.drawable.acceptbutton);
        pr14.setEnabled(false);

        SwitchTextField();
        ListXUpFull();
    } //кнопка 14


    public void ResetField(View v){
        MainListWord.clear();
        char_1.setText("");
        char_2.setText("");
        char_3.setText("");
        char_4.setText("");
        char_5.setText("");
        char_6.setText("");
        char_7.setText("");
        char_8.setText("");
        char_9.setText("");
        char_10.setText("");
        char_11.setText("");
        char_12.setText("");
        char_13.setText("");
        char_13.setText("");

        EneblendButtonsAffterPress();
        switch (getTextFlag()){
            case 1:
                ChekOut.setText("Собери слово");
                break;
        }
    } //сброс кнопок

    public void ShowStats(View v){
       Dialogus();
       onClickStop();

        img0 = a0;
        adapter.setImage(img0);
            img1 = a1;
            adapter.setImage(img1);
        img2 = a2;
        adapter.setImage(img2);
            img3 = a3;
            adapter.setImage(img3);
        img4 = a4;
        adapter.setImage(img4);
            img5 = a5;
            adapter.setImage(img5);
        img6 = a6;
        adapter.setImage(img6);
            img7 = a7;
            adapter.setImage(img7);
        img8 = a8;
        adapter.setImage(img8);
            img9 = a9;
            adapter.setImage(img9);
        img10 = a10;
        adapter.setImage(img10);
            img11 = a11;
            adapter.setImage(img11);
        img12 = a12;
        adapter.setImage(img12);
            img13 = a13;
            adapter.setImage(img13);


    } //открытие статистики

    private void createAdapterList() {
        //12*4+1 = 49
        Model model = new Model();
        model.setText("Войти в игру_0");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 3 букв 1 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 3 букв 5 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 3 букв 20 раза");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 3 букв 50 раза_4");
        model.setPeremennaya(0);
        myValues.add(model);
        //--
        model = new Model();
        model.setText("Собрать слово из 4 букв 1 раз_5");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 4 букв 5 раза");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 4 букв 20 раза");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 4 букв 50 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        //--
        model = new Model();
        model.setText("Собрать слово из 5 букв 1 раз_9");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 5 букв 5 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 5 букв 20 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 5 букв 50 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        //--
        model = new Model();
        model.setText("Собрать слово из 6 букв 1 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 6 букв 5 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 6 букв 20 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 6 букв 50 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        //--
        model = new Model();
        model.setText("Собрать слово из 7 букв 1 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 7 букв 5 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 7 букв 20 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 7 букв 50 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        //--
        model = new Model();
        model.setText("Собрать слово из 8 букв 1 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 8 букв 5 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 8 букв 20 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 8 букв 50 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        //--
        model = new Model();
        model.setText("Собрать слово из 9 букв 1 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 9 букв 5 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 9 букв 20 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 9 букв 50 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        //--
        model = new Model();
        model.setText("Собрать слово из 10 букв 1 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 10 букв 5 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 10 букв 20 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 10 букв 50 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        //--
        model = new Model();
        model.setText("Собрать слово из 11 букв 1 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 11 букв 5 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 11 букв 20 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 11 букв 50 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        //--
        model = new Model();
        model.setText("Собрать слово из 12 букв 1 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 12 букв 5 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 12 букв 20 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 12 букв 50 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        //--
        model = new Model();
        model.setText("Собрать слово из 13 букв 1 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 13 букв 5 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 13 букв 20 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 13 букв 50 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        //--
        model = new Model();
        model.setText("Собрать слово из 14 букв 1 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 14 букв 5 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 14 букв 20 раз");
        model.setPeremennaya(0);
        myValues.add(model);
        model = new Model();
        model.setText("Собрать слово из 14 букв 50 раз");
        model.setPeremennaya(0);
        myValues.add(model);
    }


    public void TaskShow(View v){
        TaskDialog();
        onClickStop();
    } //кнопка открытия заадний


    public void howAchivites(){


        switch (getList_3()) {
            case 1:
                a1 = 1; // 3 буквы 1 раз
                break;
            case 5:
                a1 = 1;
                a2 = 2; // 3 бквы2 раза
                break;
            case 20:
                a1 = 1;
                a2 = 2;
                a3 = 3; // 3 буквы 3 раза
                break;
            case 50:
                a1 = 1;
                a2 = 2;
                a3 = 3;
                a4 = 4; //3 буквы 4 раза
                break;
        }
        switch (getList_4()) {
            case 1:
                a5 = 5;// 4 буквы 1 раз
                break;
            case 5:
                a5 = 5;
                a6 = 6;
                break;
            case 20:
                a5 = 5;
                a6 = 6;
                a7 = 7;
                break;
            case 50:
                a5 = 5;
                a6 = 6;
                a7 = 7;
                a8 = 8;
                break;
        }
        switch (getList_5()) {
            case 1:
                a9 = 9;// 5 буквы 1 раз
                break;
            case 5:
                a9 = 9;
                a10 = 10;
                break;
            case 20:
                a9 = 9;
                a10 = 10;
                a11 = 11;
                break;
            case 50:
                a9 = 9;
                a10 = 10;
                a11 = 11;
                a12 = 12;
                break;
        }
        switch (getList_6()) {
            case 1:
                a13 = 13;// 6 буквы 1 раз
                break;
            case 5:
                a13 = 13;
                a14 = 14;
                break;
            case 20:
                a13 = 13;
                a14 = 14;
                a15 = 15;
                break;
            case 50:
                a13 = 13;
                a14 = 14;
                a15 = 15;
                a16 = 16;
                break;
        }
        switch (getList_7()) {
            case 1:
                a17 = 17;// 7 буквы 1 раз
                break;
            case 5:
                a17 = 17;
                a18 = 18;
                break;
            case 20:
                a17 = 17;
                a18 = 18;
                a19 = 19;
                break;
            case 50:
                a17 = 17;
                a18 = 18;
                a19 = 19;
                a20 = 20;
                break;
        }
        switch (getList_8()) {
            case 1:
                a21 = 21;// 8 буквы 1 раз
                break;
            case 5:
                a21 = 21;
                a22 = 22;
                break;
            case 20:
                a21 = 21;
                a22 = 22;
                a23 = 23;
                break;
            case 50:
                a21 = 21;
                a22 = 22;
                a23 = 23;
                a24 = 24;
                break;
        }
        switch (getList_9()) {
            case 1:
                a25 = 25;// 9 буквы 1 раз
                break;
            case 5:
                a25 = 25;
                a26 = 26;
                break;
            case 20:
                a25 = 25;
                a26 = 26;
                a27 = 27;
                break;
            case 50:
                a25 = 25;
                a26 = 26;
                a27 = 27;
                a28 = 28;
                break;
        }
        switch (getList_10()) {
            case 1:
                a29 = 29;// 10 буквы 1 раз
                break;
            case 5:
                a29 = 29;
                a30 = 30;
                break;
            case 20:
                a29 = 29;
                a30 = 30;
                a31 = 31;
                break;
            case 50:
                a29 = 29;
                a30 = 30;
                a31 = 31;
                a32 = 32;
                break;
        }
        switch (getList_11()) {
            case 1:
                a33 = 33;// 11 буквы 1 раз
                break;
            case 5:
                a33 = 33;
                a34 = 34;
                break;
            case 20:
                a33 = 33;
                a34 = 34;
                a35 = 35;
                break;
            case 50:
                a33 = 33;
                a34 = 34;
                a35 = 35;
                a36 = 36;
                break;
        }
        switch (getList_12()) {
            case 1:
                a37 = 37;// 12 буквы 1 раз
                break;
            case 5:
                a37 = 37;
                a38 = 38;
                break;
            case 20:
                a37 = 37;
                a38 = 38;
                a39 = 39;
                break;
            case 50:
                a37 = 37;
                a38 = 38;
                a39 = 39;
                a40 = 40;
                break;
        }
        switch (getList_13()) {
            case 1:
                a41 = 41;// 13 буквы 1 раз
                break;
            case 5:
                a41 = 41;
                a42 = 42;
                break;
            case 20:
                a41 = 41;
                a42 = 42;
                a43 = 43;
                break;
            case 50:
                a41 = 41;
                a42 = 42;
                a43 = 43;
                a44 = 44;
                break;
        }
        switch (getList_14()) {
            case 1:
                a45 = 45;// 14 буквы 1 раз
                break;
            case 5:
                a45 = 45;
                a46 = 46;
                break;
            case 20:
                a45 = 45;
                a46 = 46;
                a47 = 47;
                break;
            case 50:
                a45 = 45;
                a46 = 46;
                a47 = 47;
                a48 = 48;
                break;
        }
    }// условия выполения задачний

        @SuppressLint("SetTextI18n")
        public void Dialogus(){                                     // сохранять это в тхт



            LayoutInflater li = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View v = li.inflate(R.layout.stats_fragment, null, false);
            OptionDialog = new AlertDialog.Builder(this).create();
            OptionDialog.setTitle("Статистика");


            adapter = new RecyclerViewAdapter(img0);

            recyclerView = v.findViewById(R.id.recycler_view);
            recyclerView.setHasFixedSize(true);

            layoutManager = new GridLayoutManager(this, 2);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(layoutManager);
            adapter.setList(myValues);
            butClose = v.findViewById(R.id.butClose);
            OptionDialog.setView(v);
            OptionDialog.setCancelable(true);
            butClose.setBackgroundColor(Color.CYAN);
            butClose.setOnClickListener(new OnClickListener() {
                public void onClick(View v) {
                    OptionDialog.dismiss();
                }
            });
            OptionDialog.show();




















            setNumber_word_3(getList_3());
            setNumber_word_4(getList_4());
            setNumber_word_5(getList_5());
            setNumber_word_6(getList_6());
            setNumber_word_7(getList_7());
            setNumber_word_8(getList_8());
            setNumber_word_9(getList_9());
            setNumber_word_10(getList_10());

            butClose =  v.findViewById(R.id.butClose);

            text_3_inner = v.findViewById(R.id.text_3_inner);
            text_4_inner = v.findViewById(R.id.text_4_inner);
            text_5_inner = v.findViewById(R.id.text_5_inner);
            text_6_inner = v.findViewById(R.id.text_6_inner);
            text_7_inner = v.findViewById(R.id.text_7_inner);
            text_8_inner = v.findViewById(R.id.text_8_inner);
            text_9_inner = v.findViewById(R.id.text_9_inner);
            text_10_inner = v.findViewById(R.id.text_10_inner);
            text_11_inner = v.findViewById(R.id.text_11_inner);
            text_12_inner = v.findViewById(R.id.text_12_inner);
            text_13_inner = v.findViewById(R.id.text_13_inner);
            text_14_inner = v.findViewById(R.id.text_14_inner);
            text_sum_inner= v.findViewById(R.id.text_sum_inner);


            text_plus = v.findViewById(R.id.text_plus);
            text_minus = v.findViewById(R.id.text_minus);

            text_3_inner.setText(String.valueOf(getList_3()));
            text_4_inner.setText(String.valueOf(getList_4()));
            text_5_inner.setText(String.valueOf(getList_5()));
            text_6_inner.setText(String.valueOf(getList_6()));
            text_7_inner.setText(String.valueOf(getList_7()));
            text_8_inner.setText(String.valueOf(getList_8()));
            text_9_inner.setText(String.valueOf(getList_9()));
            text_10_inner.setText(String.valueOf(getList_10()));
            text_11_inner.setText(String.valueOf(getList_11()));
            text_12_inner.setText(String.valueOf(getList_12()));
            text_13_inner.setText(String.valueOf(getList_13()));
            text_14_inner.setText(String.valueOf(getList_14()));
                String sumWords = String.valueOf(getList_3()+getList_4()+getList_5()+getList_6()+getList_7()+getList_8()+getList_9()+getList_10()+getList_11()+getList_12()+getList_13()+getList_14());
            text_sum_inner.setText(sumWords);

            howAchivites();

            text_plus_lenght = "Максимальная последовательность собранных слов. Каждое следующее слово длинее предыдущего на +1 букву: ";
            text_minus_lenght = "Максимальная последовательность собранных слов. Каждое следующее слово короче предыдущего на -1 букву: ";


            text_plus.setText(text_plus_lenght + getLenght_plus());
            text_minus.setText(text_minus_lenght + getLenght_minus_minus());

            OptionDialog.setView(v);
            OptionDialog.setCancelable(true);

            butClose.setBackgroundColor(Color.CYAN);
            butClose.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    onClickStart();
                    OptionDialog.dismiss();
                }

            });

            OptionDialog.show();
        }  // окно статистика
        public void TaskDialog(){
            TaskDialog = new AlertDialog.Builder(this).create();
            LayoutInflater tasks = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View v = tasks.inflate(R.layout.task_fragment, null, false);
            butCloseTask =  v.findViewById(R.id.butCloseTask);


            thisWordShow = v.findViewById(R.id.thisWordShow);
            Thru_answer_1 = v.findViewById(R.id.Thru_answer_1);
            Thru_answer_2 = v.findViewById(R.id.Thru_answer_2);
            Thru_answer_3 = v.findViewById(R.id.Thru_answer_3);
            Thru_answer_4 = v.findViewById(R.id.Thru_answer_4);
            adapter_thru_1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, thru_list_1);
            adapter_thru_2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, thru_list_2);
            adapter_thru_3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, thru_list_3);
            adapter_thru_4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, thru_list_4);
            Thru_answer_1.setAdapter(adapter_thru_1);
            Thru_answer_2.setAdapter(adapter_thru_2);
            Thru_answer_3.setAdapter(adapter_thru_3);
            Thru_answer_4.setAdapter(adapter_thru_4);

            Wrong_answer_1 = v.findViewById(R.id.Wrong_answer_1);
            adapter_wrong_1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Wrong_list_1);
            Wrong_answer_1.setAdapter(adapter_wrong_1);



            TaskDialog.setView(v);
            TaskDialog.setCancelable(true);

            butCloseTask.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onClickStart();
                    TaskDialog.dismiss();
                }
            });

            thisWordShow.setText(getControl());

            if (getControl().equalsIgnoreCase("котлисаслон")) {
                Thru_answer_1.setVisibility(View.VISIBLE);
                Thru_answer_2.setVisibility(View.GONE);
                Thru_answer_3.setVisibility(View.GONE);
                Thru_answer_4.setVisibility(View.GONE);
                Wrong_answer_1.setVisibility(View.VISIBLE);
            } else if (getControl().equalsIgnoreCase("распределитель")) {
                Thru_answer_1.setVisibility(View.GONE);
                Thru_answer_2.setVisibility(View.VISIBLE);
                Thru_answer_3.setVisibility(View.GONE);
                Thru_answer_4.setVisibility(View.GONE);
                Wrong_answer_1.setVisibility(View.VISIBLE);
            } else if (getControl().equalsIgnoreCase("стенографистка")) {
                Thru_answer_1.setVisibility(View.GONE);
                Thru_answer_2.setVisibility(View.GONE);
                Thru_answer_3.setVisibility(View.VISIBLE);
                Thru_answer_4.setVisibility(View.GONE);
                Wrong_answer_1.setVisibility(View.VISIBLE);
            } else if (getControl().equalsIgnoreCase("простокваша")) {
                Thru_answer_1.setVisibility(View.GONE);
                Thru_answer_2.setVisibility(View.GONE);
                Thru_answer_3.setVisibility(View.GONE);
                Thru_answer_4.setVisibility(View.VISIBLE);
                Wrong_answer_1.setVisibility(View.VISIBLE);
            }
            TaskDialog.show();

        }  // список собранных слов






    public void AddDB()   {
        String a1, a2, a3;
        a1 = String.valueOf(getCounter()); // очки
        a2 = String.valueOf(getStepOnNextLvl()); // уровень
        a3 = String.valueOf(getTryChenge()); // попыток смены
        dbHelper.WriteDB(a1, a2, a3);
        //dbHelper.UpdateDB(a1, a2, a3);
       // Toast.makeText(this, a1+" "+a2+" "+a3, Toast.LENGTH_SHORT).show();
    } // добавить запись
    public void ReadfromDB() {
        dbHelper.ReadDB();
            setCounter(dbHelper.getValueScore());
            setStepOnNextLvl(dbHelper.getValueLvl());
            setTryChenge(dbHelper.getValueTrys());

                Log.d("prob", ""+getCounter()+""+getTryChenge() + ""+getStepOnNextLvl());
    } // прочесть последнюю запись
    public void DeleteDB(View v) {
        CleareDB();
    }
    public void CleareDB() {
        dbHelper.DeleteDB();
        setCounter(0);   //чтение и запись БД очки
        setStepOnNextLvl(0); //чтение и запись БД уровень
        setTryChenge(0); //чтение и запись БД попыток смены слов
            setAddsc(""+0);
            setAddlvl(""+0);
            setAddtryss(""+0);
    }// удалить

    //---работа с таблицей длинны слов букв
        public void AddDB_lenght(){
        String  b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b_plus, b_minus;
        b3 = String.valueOf(getList_3());
        b4 = String.valueOf(getList_4());
        b5 = String.valueOf(getList_5());
        b6 = String.valueOf(getList_6());
        b7 = String.valueOf(getList_7());
        b8 = String.valueOf(getList_8());
        b9 = String.valueOf(getList_9());
        b10 = String.valueOf(getList_10());
        b11 = String.valueOf(getList_11());
        b12 = String.valueOf(getList_12());
        b13 = String.valueOf(getList_13());
        b14 = String.valueOf(getList_14());
            b_plus = String.valueOf(getLenght_plus());
            b_minus = String.valueOf(getLenght_minus_minus());

            dbHelper.WriteDB_lenght(b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b_plus, b_minus);
    }
        public void ReadfromDB_lenght() {
            dbHelper.ReadDB_lenght();
                setList_3(dbHelper.getLENGHT_3());
                setList_4(dbHelper.getLENGHT_4());
                setList_5(dbHelper.getLENGHT_5());
                setList_6(dbHelper.getLENGHT_6());
                setList_7(dbHelper.getLENGHT_7());
                setList_8(dbHelper.getLENGHT_8());
                setList_9(dbHelper.getLENGHT_9());
                setList_10(dbHelper.getLENGHT_10());
                setList_11(dbHelper.getLENGHT_11());
                setList_12(dbHelper.getLENGHT_12());
                setList_13(dbHelper.getLENGHT_13());
                setList_14(dbHelper.getLENGHT_14());
                    setLenght_plus(dbHelper.getLENGHT_PLUS());
                    setLenght_minus_minus(dbHelper.getLENGHT_MINUS());



        } // прочесть последнюю запись
    //--


    //--------------сохранение-чтение списка собравнных слов
    public List<String> Switch_answer() {
        if (getControl().equalsIgnoreCase("котлисаслон")) {
            this.Alfas = thru_list_1;
            return this.Alfas;
        } else if (getControl().equalsIgnoreCase("распределитель")) {
            this.Alfas = thru_list_2;
            return this.Alfas;
        } else if (getControl().equalsIgnoreCase("стенографистка")) {
            this.Alfas = thru_list_3;
            return this.Alfas;
        } else  {
            this.Alfas = thru_list_4;
        }
        Log.d("QQW", getControl());
        return this.Alfas;
    }
    private String array2str(List<String> strings){
        StringBuilder sb = new StringBuilder();
        for (String s : strings){
            sb.append(s+ "\n");
        }
        return sb.toString();
    } //запись в тхт
    public void SaveText()  {
        myText = array2str(Switch_answer());
        if (getControl().equalsIgnoreCase("котлисаслон")) {
            this.writeTrue = "text_true_dio_1.txt";
        } else if (getControl().equalsIgnoreCase("распределитель")) {
            this.writeTrue = "text_true_dio_2.txt";
        } else if (getControl().equalsIgnoreCase("стенографистка")) {
            this.writeTrue = "text_true_dio_3.txt";
        } else if (getControl().equalsIgnoreCase("простокваша")) {
            this.writeTrue = "text_true_dio_4.txt";
        }
        try {
            outputStream = openFileOutput(writeTrue, MODE_PRIVATE);
            outputStream.write(myText.getBytes());
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();                   //если КОТЛИСАСЛОН - запись в файл кот.тхт, если другое, то в другое.тхт и показ того же списка.
        }
    } //запись в тхт
    public void LoadText() throws IOException {
        String line;
        if (getControl().equalsIgnoreCase("котлисаслон")) {
            this.read = "text_true_dio_1.txt";
        } else if (getControl().equalsIgnoreCase("распределитель")) {
            this.read = "text_true_dio_2.txt";
        } else if (getControl().equalsIgnoreCase("стенографистка")) {
            this.read = "text_true_dio_3.txt";
        } else if (getControl().equalsIgnoreCase("простокваша")) {
            this.read = "text_true_dio_4.txt";
        }
        try {
            FileInputStream in = openFileInput(read);
            InputStreamReader inputStreamReader = new InputStreamReader(in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb = new StringBuilder();
                while ((line = bufferedReader.readLine()) != null) {
                    sb.append(line);
//                        sb.append(line);
                        if (getControl().equalsIgnoreCase("котлисаслон")) {
                            thru_list_1.add(line);
                        } else if (getControl().equalsIgnoreCase("распределитель")) {
                            thru_list_2.add(line);
                        } else if (getControl().equalsIgnoreCase("стенографистка")) {
                            thru_list_3.add(line);
                        } else if (getControl().equalsIgnoreCase("простокваша")) {
                            thru_list_4.add(line);
                        }
                        inputStreamReader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
    }
    //-------
    public List<String> Wrong_Switch_answer() {
                this.WrongSwitch = Wrong_list_1;
            return this.WrongSwitch;
    }
    private String array2strWrong(List<String> strings){
        StringBuilder sb = new StringBuilder();
        for (String s : strings){
            sb.append(s+ "\n");
        }
        return sb.toString();
    } //запись в тхт НЕ ВЕРНО
    public void WriteWrong(){
        myText = array2strWrong(Wrong_Switch_answer());
            this.writeWrong = "text_wrong_dio_1.txt";
        try {
            outputStream = openFileOutput(writeWrong, MODE_PRIVATE);
            outputStream.write(myText.getBytes());
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();                   //если КОТЛИСАСЛОН - запись в файл кот.тхт, если другое, то в другое.тхт и показ того же списка.
        }
    } //запись в тхт
    public void ReadFromTxtWrong(){
        String lineWrong;
            this.readWrong = "text_wrong_dio_1.txt";

        try {
            FileInputStream in = openFileInput(readWrong);
            InputStreamReader inputStreamReader = new InputStreamReader(in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb = new StringBuilder();
            while ((lineWrong = bufferedReader.readLine()) != null) {
                sb.append(lineWrong);
//                        sb.append(line);
                if (getControl().equalsIgnoreCase("котлисаслон")) {
                    Wrong_list_1.add(lineWrong);
                } else if (getControl().equalsIgnoreCase("распределитель")) {
                    Wrong_list_1.add(lineWrong);
                } else if (getControl().equalsIgnoreCase("стенографистка")) {
                    Wrong_list_1.add(lineWrong);
                } else if (getControl().equalsIgnoreCase("простокваша")) {
                    Wrong_list_1.add(lineWrong);
                }
                inputStreamReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @Override
    protected void onDestroy() {
        SaveText();
//        Save_lenght_plus();
        AddDB();
            AddDB_lenght();


        super.onDestroy();
    }


    public void Mission_random_lenght(View v) {
        MissionDialogStart();
        onClickStop();
    }
    public void MissionDialogStart(){
        MissionsDialog = new AlertDialog.Builder(this).create();
        LayoutInflater tasks = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View missions = tasks.inflate(R.layout.activity_missions, null, false);
        butClose_mission =  missions.findViewById(R.id.butClose_mission);


            mis_1 = missions.findViewById(R.id.mis_1);
            mis_2 = missions.findViewById(R.id.mis_2);
            mis_3 = missions.findViewById(R.id.mis_3);


            mis_1.setText("Слово из 3 букв");
            mis_2.setText("Слово из 4 букв");
            mis_3.setText("С * Р А"); //СЕРА



        MissionsDialog.setView(missions);
        MissionsDialog.setCancelable(true);

        butClose_mission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickStart();
                MissionsDialog.dismiss();
            }
        });


        MissionsDialog.show();

    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Выйти из приложения на главный жкран?")
                .setMessage("Вы действительно хотите выйти?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1) {
                        //SomeActivity - имя класса Activity для которой переопределяем onBackPressed();

                        Intent intent = new Intent(GameStart.this, MainActivity.class);
                        startActivity(intent);
                        finish();

                    }
                }).create().show();
    } //переназнчание кнопки назад

}


    //Ачивка за сбор  слова (3 раза словао из 3 букв ,только если они верные) сделать. сейчас все слова в зачет идут.



