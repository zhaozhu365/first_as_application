package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView = (WebView) findViewById(R.id.webview);

        // mWebView.loadUrl("file:///android_asset/play.html");

        WebSettings settings = mWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setPluginState(WebSettings.PluginState.ON);
        mWebView.setWebChromeClient(new WebChromeClient());
		mWebView.setWebViewClient(new WebViewClient() {
			@Override
			public boolean shouldOverrideUrlLoading(WebView view, String url) {
				Log.d(MainActivity.class.getName(), url);
                view.loadUrl(url);
				return false;
			}
		});
//        mWebView.setWebViewClient(new  WebViewClient(){
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, String url) {
//                Log.e(MainActivity.class.getName(), url);
//				return super.shouldOverrideUrlLoading(view, url);
////                return true;
//            }
//        });

        String html = "";
        html += "<html><body>";
//      html += "<iframe width=\"560\" height=\"315\" src=\"http://www.youtube.com/embed/MU9Srs04sFU?rel=0\" frameborder=\"0\" allowfullscreen></iframe>";
        html += "<iframe frameborder=\"no\" border=\"0\" marginwidth=\"0\" marginheight=\"0\" width=330 height=86 src=\"http://music.163.com/outchain/player?type=2&id=29535531&auto=1&height=66\"></iframe>";
//		html += "<iframe frameborder=\"no\" border=\"0\" marginwidth=\"0\" marginheight=\"0\" width=330 height=500 src=\"http://www.baidu.com\"></iframe>";
        html += "</body></html>";
//		html = "<html><head><meta charset=\"utf-8\"><title>网易云音乐</title><link rel=\"stylesheet\" type=\"text/css\" href=\"/style/web2/css/base.css\"><link rel=\"stylesheet\" type=\"text/css\" href=\"/style/web2/css/outchain-player.css\"><style type=\"text/css\">#player{margin:10px 0 0 10px;}</style><!--[if lt IE 9]><style>.player{border:1px solid #ccc;}</style><![endif]--><script>var GEnc = true;</script></head><body><div id=\"player\"></div><div id=\"template-box\" style=\"display:none;\"> <textarea name=\"txt\" id=\"player-sm\" style=\"display:none;\"><div class=\"player player-sm\"><div class=\"head\"><div data-action=\"home\" class=\"bg logo\"></div></div><div id=\"sm-mid\" class=\"mid\"><h3><div id=\"title\"><span class=\"sub\"></span></div></h3><div id=\"bar\" class=\"bar\"><div class=\"played j-flag\" style=\"width:0;\"><span class=\"bg thumb j-flag\"></span></div></div></div><div class=\"right\"><div id=\"play\" class=\"bg play-sm\" data-action=\"play\"></div><div id=\"pause\" class=\"bg pause-sm f-hide\" data-action=\"pause\"></div><div id=\"loading\" class=\"loading f-hide\"></div></div></div></textarea><textarea name=\"txt\" id=\"player-mid\" style=\"display:none;\"><div class=\"player player-mid f-cb f-pr\"><div class=\"cover cover-sm f-pr\"><img id=\"cover\" src=\"http://s4.music.126.net/style/web2/img/default/default_list.jpg?param=66y66\"/><div class=\"mask\"></div><div id=\"play\" class=\"bg play-bg\" data-action=\"play\"></div><div id=\"pause\" class=\"bg pause-bg f-hide\" data-action=\"pause\"></div></div><div id=\"mid-ctrl\" class=\"ctrlBox\"><h2 class=\"f-pr\"><i data-action=\"home\" class=\"bg logo\"></i><div id=\"title\" class=\"title\"></div></h2><div id=\"bar\" class=\"bar\"><div class=\"played j-flag\"><span class=\"bg thumb j-flag\"></span></div></div></div><span id=\"time\" class=\"time\">- 00:00</span></div></textarea><textarea name=\"txt\" id=\"player-bg\" style=\"display:none;\"><div class=\"player\"><div class=\"f-cb\"><div class=\"cover\"><img id=\"cover\" src=\"http://s4.music.126.net/style/web2/img/default/default_list.jpg?param=90y90\"/></div><div id=\"ctrl-box\" class=\"ctrlBox\"><h2 class=\"f-pr\"><i data-action=\"home\" class=\"bg logo\"></i><div id=\"title\" class=\"title\"></div></h2><div id=\"bar\" class=\"bar\"><div class=\"played j-flag\" style=\"width:0px;\"><span class=\"bg thumb j-flag\"></span></div></div><div class=\"oprBox\"><div id=\"time\" class=\"time\">- 0:00</div><div class=\"btnGroup f-cb\"><div id=\"prev\" class=\"bg prev\" data-action=\"prev\"></div><div id=\"pause\" class=\"bg mid pause f-hide\" data-action=\"pause\"></div><div id=\"play\" class=\"bg mid play\" data-action=\"play\"></div><div id=\"next\" class=\"bg next\" data-action=\"next\"></div></div><div class=\"bg open z-dis\" data-action=\"open\"></div></div></div></div></div></textarea><textarea name=\"txt\" id=\"player-list\" style=\"display:none;\"><div class=\"player\"><div class=\"f-cb\"><div class=\"cover\"><img id=\"cover\" src=\"http://s4.music.126.net/style/web2/img/default/default_list.jpg?param=90y90\"/></div><div id=\"ctrl-box\" class=\"ctrlBox\"><h2 class=\"f-pr\"><i data-action=\"home\" class=\"bg logo\"></i><div id=\"title\" class=\"title\"></div></h2><div id=\"bar\" class=\"bar\"><div class=\"played j-flag\" style=\"width:0px;\"><span class=\"bg thumb j-flag\"></span></div></div><div class=\"oprBox\"><div id=\"time\" class=\"time\">- 0:00</div><div class=\"btnGroup f-cb\"><div id=\"prev\" class=\"bg prev\" data-action=\"prev\"></div><div id=\"pause\" class=\"bg mid pause f-hide\" data-action=\"pause\"></div><div id=\"play\" class=\"bg mid play\" data-action=\"play\"></div><div id=\"next\" class=\"bg next\" data-action=\"next\"></div></div><div class=\"bg open \" data-action=\"open\"></div></div></div></div><div id=\"list\" class=\"list\"><div class=\"box\"><ul class=\"f-cb\" id=\"list-box\"></ul><div class=\"track j-flag\"><div class=\"scroll j-flag\"></div></div></div><div data-action=\"home\" class=\"foot\"><div class=\"bg logo\"></div><div class=\"yyy\">网易云音乐</div><div class=\"slogan\">500万曲库 首首CD音质</div></div></div></div></textarea><textarea name=\"jst\" id=\"title\" style=\"display:none;\">${title}{if typeof(sub)!='undefined'}<span class=\"sub\"> - ${sub}</span>{/if}</textarea><textarea name=\"jst\" id=\"song-list\" style=\"display:none;\">{list songs as s}<li class=\"f-cb {if s_index%2==0}odd{/if}{if s_index==playIndex} z-sel{/if}\" data-action=\"playByIndex\" data-index=\"${s_index}\"><div class=\"cur\"></div><div class=\"index\">${s_index+1}</div><div class=\"name f-thide\" title=\"${s.name}\">${s.name}</div><div class=\"by f-thide\">{list s.artists as a}${a.name}{if a_index < s.artists.length-1}/{/if}{/list}</div></li>{/list}</textarea></div><script src=\"/static/web2/https/core.js?5122a543873ac6c81ab1fe3161171e86\"></script><script src=\"/static/web2/https/pt_outchain_player.js?f8243018ef84cdf72cc4d644e4b6c429\"></script></body><script type=\"text/javascript\">var _gaq = _gaq || [];_gaq.push(['_setAccount', 'UA-38766552-1'],['_setLocalGifPath', '/UA-38766552-1/__utm.gif'],['_setLocalRemoteServerMode']);_gaq.push(['_trackPageview']);(function() {var ga = document.createElement('script');ga.type = 'text/javascript';ga.async = true;ga.src = '//wr.da.netease.com/ga.js';var s = document.getElementsByTagName('script')[0];s.parentNode.insertBefore(ga, s);})();//fix ipad下的一个bugif (navigator.userAgent.indexOf('iPad') != -1) {iframeHeight = Math.max(Math.max(document.body.scrollHeight, document.documentElement.scrollHeight),Math.max(document.body.offsetHeight, document.documentElement.offsetHeight),Math.max(document.body.clientHeight, document.documentElement.clientHeight));top.document.body.style.height = iframeHeight + 20 + 'px';}</script></html>";
        mWebView.loadData(html, "text/html", "utf-8");

    }
}
