.class public Lcom/alipay/sdk/m/x/e$c;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alipay/sdk/m/x/e;->setChromeProxy(Lcom/alipay/sdk/m/x/e$f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/alipay/sdk/m/x/e;


# direct methods
.method public constructor <init>(Lcom/alipay/sdk/m/x/e;)V
    .locals 0

    iput-object p1, p0, Lcom/alipay/sdk/m/x/e$c;->a:Lcom/alipay/sdk/m/x/e;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onJsPrompt(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z
    .locals 6

    iget-object p1, p0, Lcom/alipay/sdk/m/x/e$c;->a:Lcom/alipay/sdk/m/x/e;

    invoke-static {p1}, Lcom/alipay/sdk/m/x/e;->o(Lcom/alipay/sdk/m/x/e;)Lcom/alipay/sdk/m/x/e$f;

    move-result-object v0

    iget-object v1, p0, Lcom/alipay/sdk/m/x/e$c;->a:Lcom/alipay/sdk/m/x/e;

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/alipay/sdk/m/x/e$f;->h(Lcom/alipay/sdk/m/x/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z

    move-result p1

    return p1
.end method

.method public onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/alipay/sdk/m/x/e$c;->a:Lcom/alipay/sdk/m/x/e;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/alipay/sdk/m/x/e;->m(Lcom/alipay/sdk/m/x/e;)Lcom/alipay/sdk/m/x/e$e;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Lcom/alipay/sdk/m/x/e$e;->b(Lcom/alipay/sdk/m/x/e$e;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_2

    .line 12
    .line 13
    const/16 p1, 0x5a

    .line 14
    .line 15
    const/4 v0, 0x4

    .line 16
    if-le p2, p1, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, Lcom/alipay/sdk/m/x/e$c;->a:Lcom/alipay/sdk/m/x/e;

    .line 19
    .line 20
    invoke-static {p1}, Lcom/alipay/sdk/m/x/e;->n(Lcom/alipay/sdk/m/x/e;)Landroid/widget/ProgressBar;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object p1, p0, Lcom/alipay/sdk/m/x/e$c;->a:Lcom/alipay/sdk/m/x/e;

    .line 29
    .line 30
    invoke-static {p1}, Lcom/alipay/sdk/m/x/e;->n(Lcom/alipay/sdk/m/x/e;)Landroid/widget/ProgressBar;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-ne p1, v0, :cond_1

    .line 39
    .line 40
    iget-object p1, p0, Lcom/alipay/sdk/m/x/e$c;->a:Lcom/alipay/sdk/m/x/e;

    .line 41
    .line 42
    invoke-static {p1}, Lcom/alipay/sdk/m/x/e;->n(Lcom/alipay/sdk/m/x/e;)Landroid/widget/ProgressBar;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const/4 v0, 0x0

    .line 47
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    :cond_1
    iget-object p1, p0, Lcom/alipay/sdk/m/x/e$c;->a:Lcom/alipay/sdk/m/x/e;

    .line 51
    .line 52
    invoke-static {p1}, Lcom/alipay/sdk/m/x/e;->n(Lcom/alipay/sdk/m/x/e;)Landroid/widget/ProgressBar;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1, p2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    iget-object p1, p0, Lcom/alipay/sdk/m/x/e$c;->a:Lcom/alipay/sdk/m/x/e;

    .line 61
    .line 62
    invoke-static {p1}, Lcom/alipay/sdk/m/x/e;->n(Lcom/alipay/sdk/m/x/e;)Landroid/widget/ProgressBar;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    const/16 p2, 0x8

    .line 67
    .line 68
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 69
    .line 70
    .line 71
    :goto_0
    return-void
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
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
.end method

.method public onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    iget-object p1, p0, Lcom/alipay/sdk/m/x/e$c;->a:Lcom/alipay/sdk/m/x/e;

    invoke-static {p1}, Lcom/alipay/sdk/m/x/e;->o(Lcom/alipay/sdk/m/x/e;)Lcom/alipay/sdk/m/x/e$f;

    move-result-object p1

    iget-object v0, p0, Lcom/alipay/sdk/m/x/e$c;->a:Lcom/alipay/sdk/m/x/e;

    invoke-interface {p1, v0, p2}, Lcom/alipay/sdk/m/x/e$f;->d(Lcom/alipay/sdk/m/x/e;Ljava/lang/String;)V

    return-void
.end method
