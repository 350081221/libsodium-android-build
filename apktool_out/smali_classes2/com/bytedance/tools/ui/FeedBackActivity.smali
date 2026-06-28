.class public Lcom/bytedance/tools/ui/FeedBackActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"


# annotations
.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation


# instance fields
.field private a:Landroid/widget/EditText;

.field private b:Landroid/widget/Button;

.field private c:Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;

.field private d:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method static synthetic D(Lcom/bytedance/tools/ui/FeedBackActivity;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/bytedance/tools/ui/FeedBackActivity;->E(Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method

.method private E(Ljava/lang/String;ZLjava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/bytedance/tools/ui/FeedBackActivity$c;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/bytedance/tools/ui/FeedBackActivity$c;-><init>(Lcom/bytedance/tools/ui/FeedBackActivity;Ljava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic F(Lcom/bytedance/tools/ui/FeedBackActivity;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/bytedance/tools/ui/FeedBackActivity;->d:Z

    return p0
.end method

.method static synthetic G(Lcom/bytedance/tools/ui/FeedBackActivity;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/bytedance/tools/ui/FeedBackActivity;->d:Z

    return p1
.end method

.method static synthetic I(Lcom/bytedance/tools/ui/FeedBackActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/bytedance/tools/ui/FeedBackActivity;->K()V

    return-void
.end method

.method static synthetic J(Lcom/bytedance/tools/ui/FeedBackActivity;)Landroid/widget/EditText;
    .locals 0

    iget-object p0, p0, Lcom/bytedance/tools/ui/FeedBackActivity;->a:Landroid/widget/EditText;

    return-object p0
.end method

.method private K()V
    .locals 3

    .line 1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lcom/bytedance/tools/ui/FeedBackActivity$b;

    .line 10
    .line 11
    invoke-direct {v1, p0, v0}, Lcom/bytedance/tools/ui/FeedBackActivity$b;-><init>(Lcom/bytedance/tools/ui/FeedBackActivity;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/bytedance/tools/ui/FeedBackActivity;->L()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {v1, v2, v0}, Lcom/bytedance/tools/b/b;->d(Lm1/a$a;Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method private L()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/tools/ui/FeedBackActivity;->a:Landroid/widget/EditText;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    const-string v0, ""

    .line 17
    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public C()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/tools/ui/FeedBackActivity;->c:Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->setVisibility(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/bytedance/tools/ui/FeedBackActivity;->c:Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->d()V

    .line 10
    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public H()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/tools/ui/FeedBackActivity;->c:Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->e()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/bytedance/tools/ui/FeedBackActivity;->c:Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;

    .line 7
    .line 8
    const/16 v1, 0x8

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->setVisibility(I)V

    .line 11
    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
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
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lcom/bytedance/tools/b/b;->e()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    const-string/jumbo p1, "\u521d\u59cb\u5316\u65e5\u5fd7\u6536\u96c6\u5931\u8d25"

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityCreateEnd()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    invoke-static {}, Lcom/a/a/a/a;->l()V

    .line 40
    .line 41
    .line 42
    sget p1, Lcom/bytedance/tools/R$layout;->C:I

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    .line 45
    .line 46
    .line 47
    sget p1, Lcom/bytedance/tools/R$id;->f4:I

    .line 48
    .line 49
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    .line 54
    .line 55
    const-string/jumbo v0, "\u7a7f\u5c71\u7532SDK\u95ee\u9898\u53cd\u9988"

    .line 56
    .line 57
    .line 58
    invoke-static {p0, p1, v0}, Lcom/bytedance/tools/d/i;->a(Landroidx/appcompat/app/AppCompatActivity;Landroidx/appcompat/widget/Toolbar;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    sget p1, Lcom/bytedance/tools/R$id;->R0:I

    .line 62
    .line 63
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    check-cast p1, Landroid/widget/EditText;

    .line 68
    .line 69
    iput-object p1, p0, Lcom/bytedance/tools/ui/FeedBackActivity;->a:Landroid/widget/EditText;

    .line 70
    .line 71
    sget p1, Lcom/bytedance/tools/R$id;->g0:I

    .line 72
    .line 73
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    check-cast p1, Landroid/widget/Button;

    .line 78
    .line 79
    iput-object p1, p0, Lcom/bytedance/tools/ui/FeedBackActivity;->b:Landroid/widget/Button;

    .line 80
    .line 81
    sget p1, Lcom/bytedance/tools/R$id;->H1:I

    .line 82
    .line 83
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    check-cast p1, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;

    .line 88
    .line 89
    iput-object p1, p0, Lcom/bytedance/tools/ui/FeedBackActivity;->c:Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;

    .line 90
    .line 91
    iget-object p1, p0, Lcom/bytedance/tools/ui/FeedBackActivity;->b:Landroid/widget/Button;

    .line 92
    .line 93
    new-instance v0, Lcom/bytedance/tools/ui/FeedBackActivity$a;

    .line 94
    .line 95
    invoke-direct {v0, p0}, Lcom/bytedance/tools/ui/FeedBackActivity$a;-><init>(Lcom/bytedance/tools/ui/FeedBackActivity;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 99
    .line 100
    .line 101
    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityCreateEnd()V

    .line 102
    .line 103
    .line 104
    return-void
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
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
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

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

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

    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStart()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityStartEnd()V

    return-void
.end method
