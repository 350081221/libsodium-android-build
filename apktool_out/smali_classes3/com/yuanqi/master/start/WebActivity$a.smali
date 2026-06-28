.class public final Lcom/yuanqi/master/start/WebActivity$a;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/start/WebActivity;->H(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "com/yuanqi/master/start/WebActivity$loadUrl$2",
        "Landroid/webkit/WebChromeClient;",
        "onProgressChanged",
        "",
        "view",
        "Landroid/webkit/WebView;",
        "newProgress",
        "",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic a:Lcom/yuanqi/master/start/WebActivity;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/start/WebActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/yuanqi/master/start/WebActivity$a;->a:Lcom/yuanqi/master/start/WebActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
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
    .line 24
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 2
    .param p1    # Landroid/webkit/WebView;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onProgressChanged(Landroid/webkit/WebView;I)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/yuanqi/master/start/WebActivity$a;->a:Lcom/yuanqi/master/start/WebActivity;

    .line 5
    .line 6
    invoke-static {p1}, Lcom/yuanqi/master/start/WebActivity;->E(Lcom/yuanqi/master/start/WebActivity;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v1, "onProgressChanged: "

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/yuanqi/master/start/WebActivity$a;->a:Lcom/yuanqi/master/start/WebActivity;

    .line 31
    .line 32
    invoke-static {p1}, Lcom/yuanqi/master/start/WebActivity;->D(Lcom/yuanqi/master/start/WebActivity;)Lcom/yqtech/multiapp/databinding/ActivityWebBinding;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const/4 v0, 0x0

    .line 37
    const-string v1, "binding"

    .line 38
    .line 39
    if-nez p1, :cond_0

    .line 40
    .line 41
    invoke-static {v1}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    move-object p1, v0

    .line 45
    :cond_0
    iget-object p1, p1, Lcom/yqtech/multiapp/databinding/ActivityWebBinding;->progressBar:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    .line 46
    .line 47
    invoke-virtual {p1, p2}, Lcom/google/android/material/progressindicator/BaseProgressIndicator;->setProgress(I)V

    .line 48
    .line 49
    .line 50
    const/16 p1, 0x64

    .line 51
    .line 52
    if-ne p2, p1, :cond_2

    .line 53
    .line 54
    iget-object p1, p0, Lcom/yuanqi/master/start/WebActivity$a;->a:Lcom/yuanqi/master/start/WebActivity;

    .line 55
    .line 56
    invoke-static {p1}, Lcom/yuanqi/master/start/WebActivity;->D(Lcom/yuanqi/master/start/WebActivity;)Lcom/yqtech/multiapp/databinding/ActivityWebBinding;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-nez p1, :cond_1

    .line 61
    .line 62
    invoke-static {v1}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    move-object v0, p1

    .line 67
    :goto_0
    iget-object p1, v0, Lcom/yqtech/multiapp/databinding/ActivityWebBinding;->progressBar:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    .line 68
    .line 69
    const/16 p2, 0x8

    .line 70
    .line 71
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 72
    .line 73
    .line 74
    :cond_2
    return-void
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
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method
