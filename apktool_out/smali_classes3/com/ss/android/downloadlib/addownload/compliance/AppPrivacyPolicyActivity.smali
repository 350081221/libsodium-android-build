.class public Lcom/ss/android/downloadlib/addownload/compliance/AppPrivacyPolicyActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# annotations
.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation


# instance fields
.field private a:Landroid/widget/ImageView;

.field private b:Landroid/webkit/WebView;

.field private c:J

.field private d:J

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/ss/android/downloadlib/addownload/compliance/AppPrivacyPolicyActivity;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/AppPrivacyPolicyActivity;->d:J

    return-wide v0
.end method

.method public static a(Landroid/app/Activity;J)V
    .locals 2

    .line 2
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ss/android/downloadlib/addownload/compliance/AppPrivacyPolicyActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "app_info_id"

    .line 3
    invoke-virtual {v0, v1, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 4
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private a(Landroid/webkit/WebView;)V
    .locals 1

    :try_start_0
    const-string v0, "searchBoxJavaBridge_"

    .line 11
    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    const-string v0, "accessibility"

    .line 12
    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    const-string v0, "accessibilityTraversal"

    .line 13
    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private a()Z
    .locals 4

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "app_info_id"

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/AppPrivacyPolicyActivity;->c:J

    .line 6
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/compliance/c;->a()Lcom/ss/android/downloadlib/addownload/compliance/c;

    move-result-object v0

    iget-wide v1, p0, Lcom/ss/android/downloadlib/addownload/compliance/AppPrivacyPolicyActivity;->c:J

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadlib/addownload/compliance/c;->a(J)Lcom/ss/android/downloadlib/addownload/b/b;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 7
    :cond_0
    iget-wide v1, v0, Lcom/ss/android/downloadlib/addownload/b/b;->b:J

    iput-wide v1, p0, Lcom/ss/android/downloadlib/addownload/compliance/AppPrivacyPolicyActivity;->d:J

    .line 8
    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/b/b;->i:Ljava/lang/String;

    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/AppPrivacyPolicyActivity;->e:Ljava/lang/String;

    .line 9
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 10
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->j()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "ad_privacy_backup_url"

    const-string v2, "https://sf6-ttcdn-tos.pstatp.com/obj/ad-tetris-site/personal-privacy-page.html"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/AppPrivacyPolicyActivity;->e:Ljava/lang/String;

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private b()V
    .locals 3

    .line 1
    sget v0, Lcom/bytedance/gromore/R$id;->d0:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/widget/ImageView;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/AppPrivacyPolicyActivity;->a:Landroid/widget/ImageView;

    .line 10
    .line 11
    sget v0, Lcom/bytedance/gromore/R$id;->x0:I

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroid/webkit/WebView;

    .line 18
    .line 19
    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/AppPrivacyPolicyActivity;->b:Landroid/webkit/WebView;

    .line 20
    .line 21
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/AppPrivacyPolicyActivity;->a:Landroid/widget/ImageView;

    .line 22
    .line 23
    new-instance v1, Lcom/ss/android/downloadlib/addownload/compliance/AppPrivacyPolicyActivity$1;

    .line 24
    .line 25
    invoke-direct {v1, p0}, Lcom/ss/android/downloadlib/addownload/compliance/AppPrivacyPolicyActivity$1;-><init>(Lcom/ss/android/downloadlib/addownload/compliance/AppPrivacyPolicyActivity;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/AppPrivacyPolicyActivity;->b:Landroid/webkit/WebView;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const/16 v1, 0x10

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setDefaultFontSize(I)V

    .line 40
    .line 41
    .line 42
    const/4 v1, -0x1

    .line 43
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 44
    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 51
    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setDisplayZoomControls(Z)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/AppPrivacyPolicyActivity;->b:Landroid/webkit/WebView;

    .line 79
    .line 80
    new-instance v1, Lcom/ss/android/downloadlib/addownload/compliance/AppPrivacyPolicyActivity$2;

    .line 81
    .line 82
    invoke-direct {v1, p0}, Lcom/ss/android/downloadlib/addownload/compliance/AppPrivacyPolicyActivity$2;-><init>(Lcom/ss/android/downloadlib/addownload/compliance/AppPrivacyPolicyActivity;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 86
    .line 87
    .line 88
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/AppPrivacyPolicyActivity;->b:Landroid/webkit/WebView;

    .line 89
    .line 90
    invoke-direct {p0, v0}, Lcom/ss/android/downloadlib/addownload/compliance/AppPrivacyPolicyActivity;->a(Landroid/webkit/WebView;)V

    .line 91
    .line 92
    .line 93
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/AppPrivacyPolicyActivity;->b:Landroid/webkit/WebView;

    .line 94
    .line 95
    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->setScrollBarStyle(I)V

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/AppPrivacyPolicyActivity;->b:Landroid/webkit/WebView;

    .line 99
    .line 100
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/compliance/AppPrivacyPolicyActivity;->e:Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    return-void
    .line 106
.end method


# virtual methods
.method public onBackPressed()V
    .locals 3

    .line 1
    const-string v0, "lp_app_privacy_click_close"

    .line 2
    .line 3
    iget-wide v1, p0, Lcom/ss/android/downloadlib/addownload/compliance/AppPrivacyPolicyActivity;->d:J

    .line 4
    .line 5
    invoke-static {v0, v1, v2}, Lcom/ss/android/downloadlib/addownload/compliance/g;->a(Ljava/lang/String;J)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/TraceManager;->startActivityTrace(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    sget p1, Lcom/bytedance/gromore/R$layout;->Y:I

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setContentView(I)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/compliance/AppPrivacyPolicyActivity;->a()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/compliance/AppPrivacyPolicyActivity;->b()V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {p0}, Lcom/ss/android/socialbase/appdownloader/c;->a(Landroid/app/Activity;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityCreateEnd()V

    .line 34
    .line 35
    .line 36
    return-void
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method protected onRestart()V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityRestartBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onRestart()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityRestartEnd()V

    return-void
.end method

.method protected onResume()V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityResumeBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityResumeEnd()V

    return-void
.end method

.method protected onStart()V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityStartBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityStartEnd()V

    return-void
.end method
