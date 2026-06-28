.class public final Lcom/yuanqi/master/manager/ManagerActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yuanqi/master/manager/ManagerActivity$a;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u0014R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/yuanqi/master/manager/ManagerActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "()V",
        "managerViewModel",
        "Lcom/yuanqi/master/manager/ManagerViewModel;",
        "getManagerViewModel",
        "()Lcom/yuanqi/master/manager/ManagerViewModel;",
        "managerViewModel$delegate",
        "Lkotlin/Lazy;",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "Companion",
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

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nManagerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManagerActivity.kt\ncom/yuanqi/master/manager/ManagerActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,64:1\n75#2,13:65\n*S KotlinDebug\n*F\n+ 1 ManagerActivity.kt\ncom/yuanqi/master/manager/ManagerActivity\n*L\n14#1:65,13\n*E\n"
    }
.end annotation


# static fields
.field public static final b:Lcom/yuanqi/master/manager/ManagerActivity$a;
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final c:I

.field private static d:Lcom/yuanqi/master/manager/ManagerActivity;
    .annotation build Lp4/m;
    .end annotation
.end field


# instance fields
.field private final a:Lkotlin/d0;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/yuanqi/master/manager/ManagerActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/yuanqi/master/manager/ManagerActivity$a;-><init>(Lkotlin/jvm/internal/w;)V

    sput-object v0, Lcom/yuanqi/master/manager/ManagerActivity;->b:Lcom/yuanqi/master/manager/ManagerActivity$a;

    const/16 v0, 0x8

    sput v0, Lcom/yuanqi/master/manager/ManagerActivity;->c:I

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/yuanqi/master/manager/ManagerActivity$b;->INSTANCE:Lcom/yuanqi/master/manager/ManagerActivity$b;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lcom/yuanqi/master/manager/ManagerActivity$c;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Lcom/yuanqi/master/manager/ManagerActivity$c;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    new-instance v1, Landroidx/lifecycle/ViewModelLazy;

    .line 14
    .line 15
    const-class v2, Lcom/yuanqi/master/manager/ManagerViewModel;

    .line 16
    .line 17
    invoke-static {v2}, Lkotlin/jvm/internal/l1;->d(Ljava/lang/Class;)Lkotlin/reflect/d;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    new-instance v3, Lcom/yuanqi/master/manager/ManagerActivity$d;

    .line 22
    .line 23
    invoke-direct {v3, p0}, Lcom/yuanqi/master/manager/ManagerActivity$d;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 24
    .line 25
    .line 26
    new-instance v4, Lcom/yuanqi/master/manager/ManagerActivity$e;

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    invoke-direct {v4, v5, p0}, Lcom/yuanqi/master/manager/ManagerActivity$e;-><init>(Lv3/a;Landroidx/activity/ComponentActivity;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lkotlin/reflect/d;Lv3/a;Lv3/a;Lv3/a;)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Lcom/yuanqi/master/manager/ManagerActivity;->a:Lkotlin/d0;

    .line 36
    .line 37
    return-void
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
.end method

.method public static final synthetic C()Lcom/yuanqi/master/manager/ManagerActivity;
    .locals 1

    sget-object v0, Lcom/yuanqi/master/manager/ManagerActivity;->d:Lcom/yuanqi/master/manager/ManagerActivity;

    return-object v0
.end method

.method public static final synthetic D(Lcom/yuanqi/master/manager/ManagerActivity;)V
    .locals 0

    sput-object p0, Lcom/yuanqi/master/manager/ManagerActivity;->d:Lcom/yuanqi/master/manager/ManagerActivity;

    return-void
.end method


# virtual methods
.method public final E()Lcom/yuanqi/master/manager/ManagerViewModel;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lcom/yuanqi/master/manager/ManagerActivity;->a:Lkotlin/d0;

    invoke-interface {v0}, Lkotlin/d0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/yuanqi/master/manager/ManagerViewModel;

    return-object v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 7
    .param p1    # Landroid/os/Bundle;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    const-string v0, "app_note"

    .line 2
    .line 3
    const-class v1, Lcom/yuanqi/master/manager/ManagerActivity;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lcom/huawei/agconnect/apms/instrument/TraceManager;->startActivityTrace(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    sput-object p0, Lcom/yuanqi/master/manager/ManagerActivity;->d:Lcom/yuanqi/master/manager/ManagerActivity;

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    const/4 v1, 0x0

    .line 19
    :try_start_0
    invoke-virtual {p0}, Lcom/yuanqi/master/manager/ManagerActivity;->E()Lcom/yuanqi/master/manager/ManagerViewModel;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const-string v4, "index"

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    invoke-virtual {v3, v4, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-virtual {v2, v3}, Lcom/yuanqi/master/manager/ManagerViewModel;->W(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/yuanqi/master/manager/ManagerActivity;->E()Lcom/yuanqi/master/manager/ManagerViewModel;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    const-string v4, "package_name"

    .line 46
    .line 47
    invoke-virtual {v3, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v2, v3}, Lcom/yuanqi/master/manager/ManagerViewModel;->Y(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/yuanqi/master/manager/ManagerActivity;->E()Lcom/yuanqi/master/manager/ManagerViewModel;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    const-string v4, "user_id"

    .line 63
    .line 64
    const/4 v6, -0x1

    .line 65
    invoke-virtual {v3, v4, v6}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    invoke-virtual {v2, v3}, Lcom/yuanqi/master/manager/ManagerViewModel;->b0(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Lcom/yuanqi/master/manager/ManagerActivity;->E()Lcom/yuanqi/master/manager/ManagerViewModel;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    const-string v4, "app_name"

    .line 81
    .line 82
    invoke-virtual {v3, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-virtual {v2, v3}, Lcom/yuanqi/master/manager/ManagerViewModel;->S(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Lcom/yuanqi/master/manager/ManagerActivity;->E()Lcom/yuanqi/master/manager/ManagerViewModel;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    const-string v4, "is_first"

    .line 98
    .line 99
    invoke-virtual {v3, v4, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    invoke-virtual {v2, v3}, Lcom/yuanqi/master/manager/ManagerViewModel;->V(Z)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-virtual {v2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_1

    .line 115
    .line 116
    invoke-virtual {p0}, Lcom/yuanqi/master/manager/ManagerActivity;->E()Lcom/yuanqi/master/manager/ManagerViewModel;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 121
    .line 122
    const/16 v4, 0x21

    .line 123
    .line 124
    if-lt v3, v4, :cond_0

    .line 125
    .line 126
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    const-class v4, Lv2/b;

    .line 131
    .line 132
    invoke-virtual {v3, v0, v4}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;Ljava/lang/Class;)Ljava/io/Serializable;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    check-cast v0, Lv2/b;

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    invoke-virtual {v3, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    const-string v3, "null cannot be cast to non-null type com.yuanqi.master.database.model.AppNote"

    .line 148
    .line 149
    invoke-static {v0, v3}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    check-cast v0, Lv2/b;

    .line 153
    .line 154
    :goto_0
    invoke-virtual {v2, v0}, Lcom/yuanqi/master/manager/ManagerViewModel;->X(Lv2/b;)V

    .line 155
    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_1
    invoke-virtual {p0}, Lcom/yuanqi/master/manager/ManagerActivity;->E()Lcom/yuanqi/master/manager/ManagerViewModel;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-virtual {v0, v1}, Lcom/yuanqi/master/manager/ManagerViewModel;->X(Lv2/b;)V

    .line 163
    .line 164
    .line 165
    :goto_1
    invoke-virtual {p0}, Lcom/yuanqi/master/manager/ManagerActivity;->E()Lcom/yuanqi/master/manager/ManagerViewModel;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-virtual {v0}, Lcom/yuanqi/master/manager/ManagerViewModel;->C()Lv2/b;

    .line 170
    .line 171
    .line 172
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 173
    const-string v2, "\u5e94\u7528\u9501"

    .line 174
    .line 175
    if-eqz v0, :cond_4

    .line 176
    .line 177
    :try_start_1
    invoke-virtual {p0}, Lcom/yuanqi/master/manager/ManagerActivity;->E()Lcom/yuanqi/master/manager/ManagerViewModel;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-virtual {v0}, Lcom/yuanqi/master/manager/ManagerViewModel;->B()Lkotlinx/coroutines/flow/e0;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-virtual {p0}, Lcom/yuanqi/master/manager/ManagerActivity;->E()Lcom/yuanqi/master/manager/ManagerViewModel;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    invoke-virtual {v3}, Lcom/yuanqi/master/manager/ManagerViewModel;->C()Lv2/b;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    invoke-static {v3}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v3}, Lv2/b;->getNoteName()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    invoke-interface {v0, v3}, Lkotlinx/coroutines/flow/e0;->setValue(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0}, Lcom/yuanqi/master/manager/ManagerActivity;->E()Lcom/yuanqi/master/manager/ManagerViewModel;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-virtual {v0}, Lcom/yuanqi/master/manager/ManagerViewModel;->C()Lv2/b;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0}, Lv2/b;->getAppPwd()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    if-lez v0, :cond_2

    .line 223
    .line 224
    move v5, p1

    .line 225
    :cond_2
    if-eqz v5, :cond_3

    .line 226
    .line 227
    invoke-virtual {p0}, Lcom/yuanqi/master/manager/ManagerActivity;->E()Lcom/yuanqi/master/manager/ManagerViewModel;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-virtual {v0}, Lcom/yuanqi/master/manager/ManagerViewModel;->E()Lkotlinx/coroutines/flow/e0;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    const-string v2, "\u4fee\u6539\u5bc6\u7801"

    .line 236
    .line 237
    invoke-interface {v0, v2}, Lkotlinx/coroutines/flow/e0;->setValue(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    goto :goto_2

    .line 241
    :cond_3
    invoke-virtual {p0}, Lcom/yuanqi/master/manager/ManagerActivity;->E()Lcom/yuanqi/master/manager/ManagerViewModel;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    invoke-virtual {v0}, Lcom/yuanqi/master/manager/ManagerViewModel;->E()Lkotlinx/coroutines/flow/e0;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-interface {v0, v2}, Lkotlinx/coroutines/flow/e0;->setValue(Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    goto :goto_2

    .line 253
    :cond_4
    invoke-virtual {p0}, Lcom/yuanqi/master/manager/ManagerActivity;->E()Lcom/yuanqi/master/manager/ManagerViewModel;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-virtual {v0}, Lcom/yuanqi/master/manager/ManagerViewModel;->E()Lkotlinx/coroutines/flow/e0;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-interface {v0, v2}, Lkotlinx/coroutines/flow/e0;->setValue(Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {p0}, Lcom/yuanqi/master/manager/ManagerActivity;->E()Lcom/yuanqi/master/manager/ManagerViewModel;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-virtual {v0}, Lcom/yuanqi/master/manager/ManagerViewModel;->B()Lkotlinx/coroutines/flow/e0;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    const-string v2, "\u8bbe\u7f6e\u540d\u79f0"

    .line 273
    .line 274
    invoke-interface {v0, v2}, Lkotlinx/coroutines/flow/e0;->setValue(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 275
    .line 276
    .line 277
    goto :goto_2

    .line 278
    :catch_0
    move-exception v0

    .line 279
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 280
    .line 281
    .line 282
    :goto_2
    sget-object v0, Lcom/yuanqi/master/manager/b;->a:Lcom/yuanqi/master/manager/b;

    .line 283
    .line 284
    invoke-virtual {v0}, Lcom/yuanqi/master/manager/b;->b()Lv3/p;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-static {p0, v1, v0, p1, v1}, Landroidx/activity/compose/ComponentActivityKt;->setContent$default(Landroidx/activity/ComponentActivity;Landroidx/compose/runtime/CompositionContext;Lv3/p;ILjava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityCreateEnd()V

    .line 292
    .line 293
    .line 294
    return-void
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
.end method

.method protected onRestart()V
    .locals 1

    const-class v0, Lcom/yuanqi/master/manager/ManagerActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityRestartBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onRestart()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityRestartEnd()V

    return-void
.end method

.method protected onResume()V
    .locals 1

    const-class v0, Lcom/yuanqi/master/manager/ManagerActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityResumeBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityResumeEnd()V

    return-void
.end method

.method protected onStart()V
    .locals 1

    const-class v0, Lcom/yuanqi/master/manager/ManagerActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityStartBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStart()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityStartEnd()V

    return-void
.end method
