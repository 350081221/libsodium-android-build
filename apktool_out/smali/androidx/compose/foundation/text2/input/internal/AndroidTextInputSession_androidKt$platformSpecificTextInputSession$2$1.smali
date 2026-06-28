.class final Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$1;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/o;",
        "Lv3/p<",
        "Lkotlinx/coroutines/s0;",
        "Lkotlin/coroutines/d<",
        "-",
        "Lkotlin/r2;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$1"
    f = "AndroidTextInputSession.android.kt"
    i = {}
    l = {
        0x34
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "Lkotlinx/coroutines/s0;",
        "Lkotlin/r2;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $composeImm:Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;

.field final synthetic $imeOptions:Landroidx/compose/ui/text/input/ImeOptions;

.field final synthetic $state:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

.field label:I


# direct methods
.method constructor <init>(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;Landroidx/compose/ui/text/input/ImeOptions;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;",
            "Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;",
            "Landroidx/compose/ui/text/input/ImeOptions;",
            "Lkotlin/coroutines/d<",
            "-",
            "Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$1;->$state:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    iput-object p2, p0, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$1;->$composeImm:Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;

    iput-object p3, p0, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$1;->$imeOptions:Landroidx/compose/ui/text/input/ImeOptions;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method

.method public static synthetic h(Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$1;->invokeSuspend$lambda$0(Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$0(Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)V
    .locals 6

    .line 1
    invoke-interface {p2}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-interface {p3}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/text/TextRange;->equals-impl0(JJ)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {p2}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getCompositionInChars-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {p3}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getCompositionInChars-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 33
    :goto_1
    if-eqz v0, :cond_4

    .line 34
    .line 35
    invoke-interface {p3}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-interface {p3}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 44
    .line 45
    .line 46
    move-result-wide v1

    .line 47
    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getMax-impl(J)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-interface {p3}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getCompositionInChars-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    const/4 v3, -0x1

    .line 56
    if-eqz v2, :cond_2

    .line 57
    .line 58
    invoke-virtual {v2}, Landroidx/compose/ui/text/TextRange;->unbox-impl()J

    .line 59
    .line 60
    .line 61
    move-result-wide v4

    .line 62
    invoke-static {v4, v5}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    goto :goto_2

    .line 67
    :cond_2
    move v2, v3

    .line 68
    :goto_2
    invoke-interface {p3}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getCompositionInChars-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    if-eqz v4, :cond_3

    .line 73
    .line 74
    invoke-virtual {v4}, Landroidx/compose/ui/text/TextRange;->unbox-impl()J

    .line 75
    .line 76
    .line 77
    move-result-wide v3

    .line 78
    invoke-static {v3, v4}, Landroidx/compose/ui/text/TextRange;->getMax-impl(J)I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    :cond_3
    invoke-interface {p0, v0, v1, v2, v3}, Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;->updateSelection(IIII)V

    .line 83
    .line 84
    .line 85
    :cond_4
    invoke-interface {p2, p3}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->contentEquals(Ljava/lang/CharSequence;)Z

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    if-nez p2, :cond_5

    .line 90
    .line 91
    invoke-virtual {p1}, Landroidx/compose/ui/text/input/ImeOptions;->getKeyboardType-PjHm6EE()I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    sget-object p2, Landroidx/compose/ui/text/input/KeyboardType;->Companion:Landroidx/compose/ui/text/input/KeyboardType$Companion;

    .line 96
    .line 97
    invoke-virtual {p2}, Landroidx/compose/ui/text/input/KeyboardType$Companion;->getPassword-PjHm6EE()I

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    invoke-static {p1, p2}, Landroidx/compose/ui/text/input/KeyboardType;->equals-impl0(II)Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-nez p1, :cond_5

    .line 106
    .line 107
    invoke-interface {p0}, Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;->restartInput()V

    .line 108
    .line 109
    .line 110
    :cond_5
    return-void
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
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/d<",
            "*>;)",
            "Lkotlin/coroutines/d<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance p1, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$1;

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$1;->$state:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$1;->$composeImm:Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;

    iget-object v2, p0, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$1;->$imeOptions:Landroidx/compose/ui/text/input/ImeOptions;

    invoke-direct {p1, v0, v1, v2, p2}, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$1;-><init>(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;Landroidx/compose/ui/text/input/ImeOptions;Lkotlin/coroutines/d;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/s0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$1;->invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lkotlinx/coroutines/s0;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/s0;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$1;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$1;->label:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-eq v1, v2, :cond_0

    .line 11
    .line 12
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :cond_0
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$1;->$state:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 28
    .line 29
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$1;->$composeImm:Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;

    .line 30
    .line 31
    iget-object v3, p0, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$1;->$imeOptions:Landroidx/compose/ui/text/input/ImeOptions;

    .line 32
    .line 33
    new-instance v4, Landroidx/compose/foundation/text2/input/internal/b;

    .line 34
    .line 35
    invoke-direct {v4, v1, v3}, Landroidx/compose/foundation/text2/input/internal/b;-><init>(Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;Landroidx/compose/ui/text/input/ImeOptions;)V

    .line 36
    .line 37
    .line 38
    iput v2, p0, Landroidx/compose/foundation/text2/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$1;->label:I

    .line 39
    .line 40
    invoke-virtual {p1, v4, p0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->collectImeNotifications(Landroidx/compose/foundation/text2/input/TextFieldState$NotifyImeListener;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-ne p1, v0, :cond_2

    .line 45
    .line 46
    return-object v0

    .line 47
    :cond_2
    :goto_0
    new-instance p1, Lkotlin/y;

    .line 48
    .line 49
    invoke-direct {p1}, Lkotlin/y;-><init>()V

    .line 50
    .line 51
    .line 52
    throw p1
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
