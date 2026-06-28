.class public Lcom/yuanqi/master/BaseViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008J\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/yuanqi/master/BaseViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "()V",
        "showLoginTips",
        "",
        "context",
        "Landroid/content/Context;",
        "tipType",
        "",
        "showVipTips",
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


# static fields
.field public static final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;I)V
    .locals 17
    .param p1    # Landroid/content/Context;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move/from16 v0, p2

    .line 4
    .line 5
    const-string v2, "context"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    if-eq v0, v2, :cond_1

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    if-eq v0, v2, :cond_0

    .line 15
    .line 16
    const-string v0, "\u6ce8\u518c\u767b\u5f55\u540e\u6dfb\u52a0\u5e94\u7528\uff0c\u6ce8\u518c\u8d60\u900124\u5c0f\u65f6\u4f1a\u5458"

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string v0, "\u767b\u9646\u540e\u6253\u5f00\u5e94\u7528\uff0c\u6ce8\u518c\u900124\u5c0f\u65f6\u4f1a\u5458"

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const-string v0, "\u6ce8\u518c\u900124\u5c0f\u65f6\u4f1a\u5458\u3002"

    .line 23
    .line 24
    :goto_0
    move-object v3, v0

    .line 25
    sget-object v0, Lcom/yuanqi/master/tools/o0;->a:Lcom/yuanqi/master/tools/o0;

    .line 26
    .line 27
    const v2, 0x7f1202cb

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const-string v4, "getString(...)"

    .line 35
    .line 36
    invoke-static {v2, v4}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const v5, 0x7f1200cc

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-static {v5, v4}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const-string v6, "\u53bb\u6ce8\u518c"

    .line 50
    .line 51
    const/4 v7, 0x0

    .line 52
    const/4 v8, 0x0

    .line 53
    const/4 v9, 0x0

    .line 54
    const/4 v10, 0x0

    .line 55
    const/4 v11, 0x0

    .line 56
    const/4 v12, 0x0

    .line 57
    const/4 v13, 0x0

    .line 58
    new-instance v14, Lcom/yuanqi/master/BaseViewModel$a;

    .line 59
    .line 60
    invoke-direct {v14, v1}, Lcom/yuanqi/master/BaseViewModel$a;-><init>(Landroid/content/Context;)V

    .line 61
    .line 62
    .line 63
    const/16 v15, 0xfe0

    .line 64
    .line 65
    const/16 v16, 0x0

    .line 66
    .line 67
    move-object/from16 v1, p1

    .line 68
    .line 69
    move-object v4, v5

    .line 70
    move-object v5, v6

    .line 71
    move v6, v7

    .line 72
    move v7, v8

    .line 73
    move v8, v9

    .line 74
    move v9, v10

    .line 75
    move-object v10, v11

    .line 76
    move-object v11, v12

    .line 77
    move-object v12, v13

    .line 78
    move-object v13, v14

    .line 79
    move v14, v15

    .line 80
    move-object/from16 v15, v16

    .line 81
    .line 82
    invoke-static/range {v0 .. v15}, Lcom/yuanqi/master/tools/o0;->Y(Lcom/yuanqi/master/tools/o0;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLv3/a;Lv3/a;Lv3/a;Lv3/a;ILjava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    return-void
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

.method public final b(Landroid/content/Context;I)V
    .locals 17
    .param p1    # Landroid/content/Context;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move/from16 v0, p2

    .line 4
    .line 5
    const-string v2, "context"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    const v3, 0x7f12001f

    .line 12
    .line 13
    .line 14
    if-eq v0, v2, :cond_1

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    if-eq v0, v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const v0, 0x7f120020

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :goto_0
    move-object v3, v0

    .line 37
    invoke-static {v3}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    sget-object v0, Lcom/yuanqi/master/tools/o0;->a:Lcom/yuanqi/master/tools/o0;

    .line 41
    .line 42
    const v2, 0x7f1202cb

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    const-string v4, "getString(...)"

    .line 50
    .line 51
    invoke-static {v2, v4}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const v5, 0x7f1200cc

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-static {v5, v4}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string v6, "\u53bb\u5f00\u901a"

    .line 65
    .line 66
    const/4 v7, 0x0

    .line 67
    const/4 v8, 0x0

    .line 68
    const/4 v9, 0x0

    .line 69
    const/4 v10, 0x0

    .line 70
    const/4 v11, 0x0

    .line 71
    const/4 v12, 0x0

    .line 72
    const/4 v13, 0x0

    .line 73
    new-instance v14, Lcom/yuanqi/master/BaseViewModel$b;

    .line 74
    .line 75
    invoke-direct {v14, v1}, Lcom/yuanqi/master/BaseViewModel$b;-><init>(Landroid/content/Context;)V

    .line 76
    .line 77
    .line 78
    const/16 v15, 0xfe0

    .line 79
    .line 80
    const/16 v16, 0x0

    .line 81
    .line 82
    move-object/from16 v1, p1

    .line 83
    .line 84
    move-object v4, v5

    .line 85
    move-object v5, v6

    .line 86
    move v6, v7

    .line 87
    move v7, v8

    .line 88
    move v8, v9

    .line 89
    move v9, v10

    .line 90
    move-object v10, v11

    .line 91
    move-object v11, v12

    .line 92
    move-object v12, v13

    .line 93
    move-object v13, v14

    .line 94
    move v14, v15

    .line 95
    move-object/from16 v15, v16

    .line 96
    .line 97
    invoke-static/range {v0 .. v15}, Lcom/yuanqi/master/tools/o0;->Y(Lcom/yuanqi/master/tools/o0;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLv3/a;Lv3/a;Lv3/a;Lv3/a;ILjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    return-void
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
