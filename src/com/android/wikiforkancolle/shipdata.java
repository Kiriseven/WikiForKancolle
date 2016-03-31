package com.android.wikiforkancolle;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.android.wikiforkancolle.MyDBOpenHelper;
import com.android.wikiforkancolle.shipdata;

public class shipdata extends Activity {
	private Context mContext;
	private SQLiteDatabase db;
	private MyDBOpenHelper myDBHelper;
	private Bitmap bitmap;
	private ImageButton back;
	private ImageView lihui1;

	private Handler handler = new Handler();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shipdata);
		mContext = shipdata.this;
		myDBHelper = new MyDBOpenHelper(mContext, "kancolle.db", null, 1);
		db = myDBHelper.getReadableDatabase();
		Cursor cursor = db.query("kanmusu", null, null, null, null, null, null);
		// back��ť�Ķ�������
		back = (ImageButton) findViewById(R.id.back);
		back.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		// ��ȡҳ����ת��Ϣ����
		Intent intent_map = getIntent();
		TextView mingzi = (TextView) findViewById(R.id.mingzi);
		TextView id = (TextView) findViewById(R.id.tujianbianhao);
		TextView gaizaodengji = (TextView) findViewById(R.id.gaizaodengji);
		TextView cv = (TextView) findViewById(R.id.cv);
		TextView huashi = (TextView) findViewById(R.id.huashi);
		lihui1 = (ImageView) findViewById(R.id.lihui);
		TextView naijiu = (TextView) findViewById(R.id.naijiu);
		TextView huoli = (TextView) findViewById(R.id.huoli);
		TextView zhuangjia = (TextView) findViewById(R.id.zhuangjia);
		TextView leizhuang = (TextView) findViewById(R.id.leizhuang);
		TextView huibi = (TextView) findViewById(R.id.huibi);
		TextView duikong = (TextView) findViewById(R.id.duikong);
		TextView duiqian = (TextView) findViewById(R.id.duiqian);
		TextView sudu = (TextView) findViewById(R.id.sudu);
		TextView suodi = (TextView) findViewById(R.id.suodi);
		TextView dazai = (TextView) findViewById(R.id.dazai);
		TextView shecheng = (TextView) findViewById(R.id.shecheng);
		TextView yun = (TextView) findViewById(R.id.yun);
		TextView ranliao = (TextView) findViewById(R.id.ranliao);
		TextView danyao = (TextView) findViewById(R.id.danyao);
		TextView dazai1 = (TextView) findViewById(R.id.dazai1);
		TextView dazai2 = (TextView) findViewById(R.id.dazai2);
		TextView dazai3 = (TextView) findViewById(R.id.dazai3);
		TextView dazai4 = (TextView) findViewById(R.id.dazai4);
		TextView zhuangbei1 = (TextView) findViewById(R.id.zhuangbei1);
		TextView zhuangbei2 = (TextView) findViewById(R.id.zhuangbei2);
		TextView zhuangbei3 = (TextView) findViewById(R.id.zhuangbei3);
		TextView zhuangbei4 = (TextView) findViewById(R.id.zhuangbei4);
		TextView diaoluo = (TextView) findViewById(R.id.diaoluo);
		TextView jianzao = (TextView) findViewById(R.id.jianzao);
		/****************************************************************************/
		lihui1.setImageResource(R.drawable.loadfailed);
		/****************************************************************************/
		switch (intent_map.getExtras().getInt("shipdata")) {
		case R.id.nagato:
			// lihui1.setImageResource(R.drawable.nagato);
			setImage("https://img.mengniang.org/common/6/6c/40330385_p0.jpg");
			cursor.move(1);
			break;
		case R.id.mutsu:
			// lihui1.setImageResource(R.drawable.mutsu);
			setImage("https://img.mengniang.org/common/2/26/39065742_p0.png");
			cursor.move(2);
			break;
		case R.id.ise:
			// lihui1.setImageResource(R.drawable.ise);
			setImage("https://img.mengniang.org/common/c/c8/42902518_p0.jpg");
			cursor.move(3);
			break;
		case R.id.hyuuga:
			// lihui1.setImageResource(R.drawable.hyuga);
			setImage("https://img.mengniang.org/common/f/f6/44698298_p0.jpg");
			cursor.move(4);
			break;
		case R.id.yukikaze:
			// lihui1.setImageResource(R.drawable.yukikaze);
			setImage("https://img.mengniang.org/common/a/a0/53672107_p0.jpg");
			cursor.move(5);
			break;
		case R.id.akagi:
			// lihui1.setImageResource(R.drawable.akagi);
			setImage("https://img.mengniang.org/common/6/61/54098826_p0_master1200.jpg");
			cursor.move(6);
			break;
		case R.id.kaga:
			// lihui1.setImageResource(R.drawable.kaga);
			setImage("https://img.mengniang.org/common/c/c5/39521243_p0.jpg");
			cursor.move(7);
			break;
		case R.id.souryuu:
			// lihui1.setImageResource(R.drawable.soryu);
			setImage("https://img.mengniang.org/common/3/39/44996635.jpg");
			cursor.move(8);
			break;
		case R.id.hiryuu:
			// lihui1.setImageResource(R.drawable.hiryu);
			setImage("https://img.mengniang.org/common/0/04/44533906_p0.jpg");
			cursor.move(9);
			break;
		case R.id.shimakaze:
			// lihui1.setImageResource(R.drawable.shimakaze);
			setImage("https://img.mengniang.org/common/0/00/KanShimakaze.jpg");
			cursor.move(10);
			break;
		case R.id.fubuki:
			lihui1.setImageResource(R.drawable.fubuki);
			cursor.move(11);
			break;
		case R.id.shirayuki:
			lihui1.setImageResource(R.drawable.shirayuki);
			cursor.move(12);
			break;
		case R.id.hatsuyuki:
			lihui1.setImageResource(R.drawable.hatsuyuki);
			cursor.move(13);
			break;
		case R.id.miyuki:
			lihui1.setImageResource(R.drawable.miyuki);
			cursor.move(14);
			break;
		case R.id.murakumu:
			lihui1.setImageResource(R.drawable.murakumo);
			cursor.move(15);
			break;
		case R.id.isonami:
			lihui1.setImageResource(R.drawable.isonami);
			cursor.move(16);
			break;
		case R.id.ayanami:
			lihui1.setImageResource(R.drawable.ayanami);
			cursor.move(17);
			break;
		case R.id.shikinami:
			lihui1.setImageResource(R.drawable.shikinami);
			cursor.move(18);
			break;
		case R.id.ooi:
			lihui1.setImageResource(R.drawable.ooi);
			cursor.move(19);
			break;
		case R.id.kitakami:
			lihui1.setImageResource(R.drawable.kitakami);
			cursor.move(20);
			break;
		case R.id.kongou:
			lihui1.setImageResource(R.drawable.kongo);
			cursor.move(21);
			break;
		case R.id.hiei:
			lihui1.setImageResource(R.drawable.hiei);
			cursor.move(22);
			break;
		case R.id.haruna:
			lihui1.setImageResource(R.drawable.haruna);
			cursor.move(23);
			break;
		case R.id.kirishima:
			lihui1.setImageResource(R.drawable.kirishima);
			cursor.move(24);
			break;
		case R.id.houshyou:
			lihui1.setImageResource(R.drawable.hosho);
			cursor.move(25);
			break;
		case R.id.fusou:
			lihui1.setImageResource(R.drawable.fuso);
			cursor.move(26);
			break;
		case R.id.yamashiro:
			lihui1.setImageResource(R.drawable.yamashiro);
			cursor.move(27);
			break;
		case R.id.tenryuu:
			lihui1.setImageResource(R.drawable.tenryu);
			cursor.move(28);
			break;
		case R.id.tatsuta:
			lihui1.setImageResource(R.drawable.tatsuta);
			cursor.move(29);
			break;
		case R.id.ryuujyou:
			lihui1.setImageResource(R.drawable.ryujo);
			cursor.move(30);
			break;
		case R.id.mutsuki:
			lihui1.setImageResource(R.drawable.mutsuki);
			cursor.move(31);
			break;
		case R.id.kisaragi:
			lihui1.setImageResource(R.drawable.kisaragi);
			cursor.move(32);
			break;
		case R.id.satsuki:
			lihui1.setImageResource(R.drawable.satsuki);
			cursor.move(33);
			break;
		case R.id.fumizuki:
			lihui1.setImageResource(R.drawable.fumizuki);
			cursor.move(34);
			break;
		case R.id.nagatsuki:
			lihui1.setImageResource(R.drawable.nagatsuki);
			cursor.move(35);
			break;
		case R.id.kikuzuki:
			lihui1.setImageResource(R.drawable.kikuduki);
			cursor.move(36);
			break;
		case R.id.mikazuki:
			lihui1.setImageResource(R.drawable.mikazuk);
			cursor.move(37);
			break;
		case R.id.mochizuki:
			lihui1.setImageResource(R.drawable.mochizuki);
			cursor.move(38);
			break;
		case R.id.kuma:
			lihui1.setImageResource(R.drawable.kuma);
			cursor.move(39);
			break;
		case R.id.tama:
			lihui1.setImageResource(R.drawable.tama);
			cursor.move(40);
			break;
		case R.id.kiso:
			lihui1.setImageResource(R.drawable.kiso);
			cursor.move(41);
			break;
		case R.id.nagara:
			lihui1.setImageResource(R.drawable.nagara);
			cursor.move(42);
			break;
		case R.id.itsuzu:
			lihui1.setImageResource(R.drawable.isuzu);
			cursor.move(43);
			break;
		case R.id.natori:
			lihui1.setImageResource(R.drawable.natori);
			cursor.move(44);
			break;
		case R.id.yura:
			lihui1.setImageResource(R.drawable.yura);
			cursor.move(45);
			break;
		case R.id.sendai:
			lihui1.setImageResource(R.drawable.sendai);
			cursor.move(46);
			break;
		case R.id.jintsuu:
			lihui1.setImageResource(R.drawable.jintsu);
			cursor.move(47);
			break;
		case R.id.naka:
			lihui1.setImageResource(R.drawable.naka);
			cursor.move(48);
			break;
		case R.id.chitose:
			lihui1.setImageResource(R.drawable.chitose);
			cursor.move(49);
			break;
		case R.id.chiyoda:
			lihui1.setImageResource(R.drawable.chiyoda);
			cursor.move(50);
			break;
		case R.id.mogami:
			lihui1.setImageResource(R.drawable.mogami);
			cursor.move(51);
			break;
		case R.id.furutaka:
			lihui1.setImageResource(R.drawable.furutaka);
			cursor.move(52);
			break;
		case R.id.kako:
			lihui1.setImageResource(R.drawable.kako);
			cursor.move(53);
			break;
		case R.id.aoba:
			lihui1.setImageResource(R.drawable.aoba);
			cursor.move(54);
			break;
		case R.id.myoukou:
			lihui1.setImageResource(R.drawable.myoko);
			cursor.move(55);
			break;
		case R.id.nachi:
			lihui1.setImageResource(R.drawable.nachi);
			cursor.move(56);
			break;
		case R.id.ashigara:
			lihui1.setImageResource(R.drawable.ashigara);
			cursor.move(57);
			break;
		case R.id.haguro:
			lihui1.setImageResource(R.drawable.haguro);
			cursor.move(58);
			break;
		case R.id.takao:
			lihui1.setImageResource(R.drawable.takao);
			cursor.move(59);
			break;
		case R.id.atago:
			lihui1.setImageResource(R.drawable.atago);
			cursor.move(60);
			break;
		case R.id.maya:
			lihui1.setImageResource(R.drawable.maya);
			cursor.move(61);
			break;
		case R.id.chyoukai:
			lihui1.setImageResource(R.drawable.chokai);
			cursor.move(62);
			break;
		case R.id.tone:
			lihui1.setImageResource(R.drawable.tone);
			cursor.move(63);
			break;
		case R.id.chikuma:
			lihui1.setImageResource(R.drawable.chikuma);
			cursor.move(64);
			break;
		case R.id.hiyou:
			lihui1.setImageResource(R.drawable.hiyo);
			cursor.move(65);
			break;
		case R.id.jyunyou:
			lihui1.setImageResource(R.drawable.junyo);
			cursor.move(66);
			break;
		case R.id.oboro:
			lihui1.setImageResource(R.drawable.oboro);
			cursor.move(67);
			break;
		case R.id.akebono:
			lihui1.setImageResource(R.drawable.akebono);
			cursor.move(68);
			break;
		case R.id.sazanami:
			lihui1.setImageResource(R.drawable.sazanami);
			cursor.move(69);
			break;
		case R.id.ushio:
			lihui1.setImageResource(R.drawable.ushio);
			cursor.move(70);
			break;
		case R.id.akatsuki:
			lihui1.setImageResource(R.drawable.akatsuki);
			cursor.move(71);
			break;
		case R.id.hibiki:
			lihui1.setImageResource(R.drawable.hibiki);
			cursor.move(72);
			break;
		case R.id.ikazuchi:
			lihui1.setImageResource(R.drawable.ikazuchi);
			cursor.move(73);
			break;
		case R.id.inazuma:
			lihui1.setImageResource(R.drawable.inazuma);
			cursor.move(74);
			break;
		case R.id.hatsuharu:
			lihui1.setImageResource(R.drawable.hatsuharu);
			cursor.move(75);
			break;
		case R.id.nenohi:
			lihui1.setImageResource(R.drawable.nenohi);
			cursor.move(76);
			break;
		case R.id.wakaba:
			lihui1.setImageResource(R.drawable.wakaba);
			cursor.move(77);
			break;
		case R.id.hatsushimo:
			lihui1.setImageResource(R.drawable.hatsushimo);
			cursor.move(78);
			break;
		case R.id.shiratsuyu:
			lihui1.setImageResource(R.drawable.shiratsuyu);
			cursor.move(79);
			break;
		case R.id.shigure:
			lihui1.setImageResource(R.drawable.shigure);
			cursor.move(80);
			break;
		case R.id.murasame:
			lihui1.setImageResource(R.drawable.murasame);
			cursor.move(81);
			break;
		case R.id.yuudachi:
			lihui1.setImageResource(R.drawable.yudachi);
			cursor.move(82);
			break;
		case R.id.samidare:
			lihui1.setImageResource(R.drawable.samidare);
			cursor.move(83);
			break;
		case R.id.suzukaze:
			lihui1.setImageResource(R.drawable.suzukaze);
			cursor.move(84);
			break;
		case R.id.asashio:
			lihui1.setImageResource(R.drawable.asashio);
			cursor.move(85);
			break;
		case R.id.ooshio:
			lihui1.setImageResource(R.drawable.oshio);
			cursor.move(86);
			break;
		case R.id.michishio:
			lihui1.setImageResource(R.drawable.michishio);
			cursor.move(87);
			break;
		case R.id.arashio:
			lihui1.setImageResource(R.drawable.arashio);
			cursor.move(88);
			break;
		case R.id.arare:
			lihui1.setImageResource(R.drawable.arare);
			cursor.move(89);
			break;
		case R.id.kazumi:
			lihui1.setImageResource(R.drawable.kasumi);
			cursor.move(90);
			break;
		case R.id.kagerou:
			lihui1.setImageResource(R.drawable.kagero);
			cursor.move(91);
			break;
		case R.id.shiranui:
			lihui1.setImageResource(R.drawable.shiranui);
			cursor.move(92);
			break;
		case R.id.kuroshio:
			lihui1.setImageResource(R.drawable.kuroshio);
			cursor.move(93);
			break;
		case R.id.shyouhou:
			lihui1.setImageResource(R.drawable.shoho);
			cursor.move(94);
			break;
		case R.id.shyoukaku:
			lihui1.setImageResource(R.drawable.shoukaku);
			cursor.move(95);
			break;
		case R.id.zuikaku:
			lihui1.setImageResource(R.drawable.zuikaku);
			cursor.move(96);
			break;
		case R.id.kinu:
			lihui1.setImageResource(R.drawable.kinu);
			cursor.move(97);
			break;
		case R.id.abukuma:
			lihui1.setImageResource(R.drawable.abukuma);
			cursor.move(98);
			break;
		case R.id.yuubari:
			lihui1.setImageResource(R.drawable.yubari);
			cursor.move(99);
			break;
		case R.id.zuihou:
			lihui1.setImageResource(R.drawable.zuiho);
			cursor.move(100);
			break;
		case R.id.mikuma:
			lihui1.setImageResource(R.drawable.mikuma);
			cursor.move(101);
			break;
		case R.id.hatsukaze:
			lihui1.setImageResource(R.drawable.hatsukaze);
			cursor.move(102);
			break;
		case R.id.maikaze:
			lihui1.setImageResource(R.drawable.maikaze);
			cursor.move(103);
			break;
		case R.id.kinugasa:
			lihui1.setImageResource(R.drawable.kinugasa);
			cursor.move(104);
			break;
		case R.id.i19:
			lihui1.setImageResource(R.drawable.i19);
			cursor.move(105);
			break;
		case R.id.suzuya:
			lihui1.setImageResource(R.drawable.suzuya);
			cursor.move(106);
			break;
		case R.id.kumano:
			lihui1.setImageResource(R.drawable.kumano);
			cursor.move(107);
			break;
		case R.id.i168:
			lihui1.setImageResource(R.drawable.i168);
			cursor.move(108);
			break;
		case R.id.i58:
			lihui1.setImageResource(R.drawable.i58);
			cursor.move(109);
			break;
		case R.id.i8:
			lihui1.setImageResource(R.drawable.i8);
			cursor.move(110);
			break;
		case R.id.yamato:
			lihui1.setImageResource(R.drawable.yamato);
			cursor.move(111);
			break;
		case R.id.akigumo:
			lihui1.setImageResource(R.drawable.akigumo);
			cursor.move(112);
			break;
		case R.id.yuugumo:
			lihui1.setImageResource(R.drawable.yugumo);
			cursor.move(113);
			break;
		case R.id.makigumo:
			lihui1.setImageResource(R.drawable.makigumo);
			cursor.move(114);
			break;
		case R.id.naganami:
			lihui1.setImageResource(R.drawable.naganami);
			cursor.move(115);
			break;
		case R.id.agano:
			lihui1.setImageResource(R.drawable.agano);
			cursor.move(116);
			break;
		case R.id.noshiro:
			lihui1.setImageResource(R.drawable.noshiro);
			cursor.move(117);
			break;
		case R.id.yahagi:
			lihui1.setImageResource(R.drawable.yahagi);
			cursor.move(118);
			break;
		case R.id.sakawa:
			lihui1.setImageResource(R.drawable.sakawa);
			cursor.move(119);
			break;
		case R.id.musashi:
			lihui1.setImageResource(R.drawable.musashi);
			cursor.move(120);
			break;
		case R.id.taihou:
			lihui1.setImageResource(R.drawable.taiho);
			cursor.move(121);
			break;
		case R.id.katori:
			lihui1.setImageResource(R.drawable.katori);
			cursor.move(122);
			break;
		case R.id.i401:
			lihui1.setImageResource(R.drawable.i401);
			cursor.move(123);
			break;
		case R.id.akitsumaru:
			lihui1.setImageResource(R.drawable.akitsumaru);
			cursor.move(124);
			break;
		case R.id.maruyu:
			lihui1.setImageResource(R.drawable.maruyu);
			cursor.move(125);
			break;
		case R.id.yayoi:
			lihui1.setImageResource(R.drawable.yayoi);
			cursor.move(126);
			break;
		case R.id.uzuki:
			lihui1.setImageResource(R.drawable.uzuki);
			cursor.move(127);
			break;
		case R.id.isokaze:
			lihui1.setImageResource(R.drawable.isokaze);
			cursor.move(128);
			break;
		case R.id.urakaze:
			lihui1.setImageResource(R.drawable.urakaze);
			cursor.move(129);
			break;
		case R.id.tanikaze:
			lihui1.setImageResource(R.drawable.tanikaze);
			cursor.move(130);
			break;
		case R.id.hamakaze:
			lihui1.setImageResource(R.drawable.hamakaze);
			cursor.move(131);
			break;
		case R.id.bismaick:
			lihui1.setImageResource(R.drawable.bisumaruku);
			cursor.move(132);
			break;
		case R.id.z1:
			lihui1.setImageResource(R.drawable.z1);
			cursor.move(133);
			break;
		case R.id.z3:
			lihui1.setImageResource(R.drawable.z3);
			cursor.move(134);
			break;
		case R.id.eugen:
			lihui1.setImageResource(R.drawable.prinzeugen);
			cursor.move(135);
			break;
		case R.id.amatsukaze:
			lihui1.setImageResource(R.drawable.amatsukaze);
			cursor.move(136);
			break;
		case R.id.akashi:
			lihui1.setImageResource(R.drawable.akashi);
			cursor.move(137);
			break;
		case R.id.ooyodo:
			lihui1.setImageResource(R.drawable.oyodo);
			cursor.move(138);
			break;
		case R.id.taigei:
			lihui1.setImageResource(R.drawable.taigei);
			cursor.move(139);
			break;
		case R.id.ryuuhou:
			lihui1.setImageResource(R.drawable.ryuho);
			cursor.move(139);
			Toast.makeText(this, "大鲸就是龙凤呢", 1).show();
			break;
		case R.id.tokitsukaze:
			lihui1.setImageResource(R.drawable.tokitsukaze);
			cursor.move(140);
			break;
		case R.id.unryuu:
			lihui1.setImageResource(R.drawable.unryu);
			cursor.move(141);
			break;
		case R.id.amagi:
			lihui1.setImageResource(R.drawable.amagi);
			cursor.move(142);
			break;
		case R.id.katsuragi:
			lihui1.setImageResource(R.drawable.katsuragi);
			cursor.move(143);
			break;
		case R.id.harusame:
			lihui1.setImageResource(R.drawable.harusame);
			cursor.move(144);
			break;
		case R.id.hayashimo:
			lihui1.setImageResource(R.drawable.hayashimo);
			cursor.move(145);
			break;
		case R.id.kiyoshimo:
			lihui1.setImageResource(R.drawable.kiyoshimo);
			cursor.move(146);
			break;
		case R.id.asagumo:
			lihui1.setImageResource(R.drawable.asagumo);
			cursor.move(147);
			break;
		case R.id.yamagumo:
			lihui1.setImageResource(R.drawable.yamagumo);
			cursor.move(148);
			break;
		case R.id.nowaki:
			lihui1.setImageResource(R.drawable.nowaki);
			cursor.move(149);
			break;
		case R.id.akizuki:
			lihui1.setImageResource(R.drawable.akizuki);
			cursor.move(150);
			break;
		case R.id.teruzuki:
			lihui1.setImageResource(R.drawable.teruzuki);
			cursor.move(151);
			break;
		case R.id.takanami:
			lihui1.setImageResource(R.drawable.takanami);
			cursor.move(152);
			break;
		case R.id.asashimo:
			lihui1.setImageResource(R.drawable.asashimo);
			cursor.move(153);
			break;
		case R.id.yu511:
			lihui1.setImageResource(R.drawable.u511);
			cursor.move(154);
			break;
		case R.id.littorio:
			lihui1.setImageResource(R.drawable.littorio);
			cursor.move(155);
			break;
		case R.id.roma:
			lihui1.setImageResource(R.drawable.roma);
			cursor.move(156);
			break;
		case R.id.libeccio:
			lihui1.setImageResource(R.drawable.libeccio);
			cursor.move(157);
			break;
		case R.id.akitsushima:
			lihui1.setImageResource(R.drawable.akitsushima);
			cursor.move(158);
			break;
		case R.id.zuiho:
			lihui1.setImageResource(R.drawable.zuiho);
			cursor.move(159);
			break;
		case R.id.kazagumo:
			lihui1.setImageResource(R.drawable.kazagumo);
			cursor.move(160);
			break;
		case R.id.umikaze:
			lihui1.setImageResource(R.drawable.umikaze);
			cursor.move(161);
			break;
		case R.id.kawakaze:
			lihui1.setImageResource(R.drawable.kawakaze);
			cursor.move(162);
			break;
		}
		mingzi.setText(cursor.getString(cursor.getColumnIndex("name")));
		id.setText(cursor.getString(cursor.getColumnIndex("id")));
		cv.setText(cursor.getString(cursor.getColumnIndex("cv")));
		gaizaodengji.setText(cursor.getString(cursor
				.getColumnIndex("gaizaodengji")));
		huashi.setText(cursor.getString(cursor.getColumnIndex("renshe")));
		naijiu.setText(cursor.getString(cursor.getColumnIndex("naijiu")));
		huoli.setText(cursor.getString(cursor.getColumnIndex("huoli")));
		zhuangjia.setText(cursor.getString(cursor.getColumnIndex("zhuangjia")));
		leizhuang.setText(cursor.getString(cursor.getColumnIndex("leizhuang")));
		huibi.setText(cursor.getString(cursor.getColumnIndex("huibi")));
		duikong.setText(cursor.getString(cursor.getColumnIndex("duikong")));
		duiqian.setText(cursor.getString(cursor.getColumnIndex("duiqian")));
		sudu.setText(cursor.getString(cursor.getColumnIndex("sudu")));
		suodi.setText(cursor.getString(cursor.getColumnIndex("suodi")));
		dazai.setText(cursor.getString(cursor.getColumnIndex("dazai")));
		shecheng.setText(cursor.getString(cursor.getColumnIndex("shecheng")));
		yun.setText(cursor.getString(cursor.getColumnIndex("yun")));
		ranliao.setText(cursor.getString(cursor
				.getColumnIndex("zuidaxiaofeiliangRANLIAO")));
		danyao.setText(cursor.getString(cursor
				.getColumnIndex("zuidaxiaofeiliangDANYAO")));
		dazai1.setText(cursor.getString(cursor.getColumnIndex("dazai1")));
		dazai2.setText(cursor.getString(cursor.getColumnIndex("dazai2")));
		dazai3.setText(cursor.getString(cursor.getColumnIndex("dazai3")));
		dazai4.setText(cursor.getString(cursor.getColumnIndex("dazai4")));
		zhuangbei1
				.setText(cursor.getString(cursor.getColumnIndex("zhuangbei1")));
		zhuangbei2
				.setText(cursor.getString(cursor.getColumnIndex("zhuangbei2")));
		zhuangbei3
				.setText(cursor.getString(cursor.getColumnIndex("zhuangbei3")));
		zhuangbei4
				.setText(cursor.getString(cursor.getColumnIndex("zhuangbei4")));
		jianzao.setText(cursor.getString(cursor
				.getColumnIndex("rushoufangshiJIANZAO")));
		diaoluo.setText(cursor.getString(cursor
				.getColumnIndex("rushoufangshiDIAOLUO")));
	}

	private void setImage(String url) {
		new HttpThread(url, lihui1, handler).start();
	}

}
