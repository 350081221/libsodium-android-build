.class public final Landroidx/compose/foundation/text2/SecureTextFieldController;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0008\u0010\u0003\u001a\u00020\u0002H\u0002R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u001a"
    }
    d2 = {
        "Landroidx/compose/foundation/text2/SecureTextFieldController;",
        "",
        "Lkotlin/r2;",
        "scheduleHide",
        "Landroidx/compose/foundation/text2/PasswordRevealFilter;",
        "passwordRevealFilter",
        "Landroidx/compose/foundation/text2/PasswordRevealFilter;",
        "getPasswordRevealFilter",
        "()Landroidx/compose/foundation/text2/PasswordRevealFilter;",
        "Landroidx/compose/foundation/text2/input/CodepointTransformation;",
        "codepointTransformation",
        "Landroidx/compose/foundation/text2/input/CodepointTransformation;",
        "getCodepointTransformation",
        "()Landroidx/compose/foundation/text2/input/CodepointTransformation;",
        "Landroidx/compose/ui/Modifier;",
        "focusChangeModifier",
        "Landroidx/compose/ui/Modifier;",
        "getFocusChangeModifier",
        "()Landroidx/compose/ui/Modifier;",
        "Lkotlinx/coroutines/channels/l;",
        "resetTimerSignal",
        "Lkotlinx/coroutines/channels/l;",
        "Lkotlinx/coroutines/s0;",
        "coroutineScope",
        "<init>",
        "(Lkotlinx/coroutines/s0;)V",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final codepointTransformation:Landroidx/compose/foundation/text2/input/CodepointTransformation;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final focusChangeModifier:Landroidx/compose/ui/Modifier;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final passwordRevealFilter:Landroidx/compose/foundation/text2/PasswordRevealFilter;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final resetTimerSignal:Lkotlinx/coroutines/channels/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/l<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/s0;)V
    .locals 9
    .param p1    # Lkotlinx/coroutines/s0;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/compose/foundation/text2/PasswordRevealFilter;

    .line 5
    .line 6
    new-instance v1, Landroidx/compose/foundation/text2/SecureTextFieldController$passwordRevealFilter$1;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Landroidx/compose/foundation/text2/SecureTextFieldController$passwordRevealFilter$1;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1}, Landroidx/compose/foundation/text2/PasswordRevealFilter;-><init>(Lv3/a;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Landroidx/compose/foundation/text2/SecureTextFieldController;->passwordRevealFilter:Landroidx/compose/foundation/text2/PasswordRevealFilter;

    .line 15
    .line 16
    new-instance v0, Landroidx/compose/foundation/text2/a;

    .line 17
    .line 18
    invoke-direct {v0, p0}, Landroidx/compose/foundation/text2/a;-><init>(Landroidx/compose/foundation/text2/SecureTextFieldController;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Landroidx/compose/foundation/text2/SecureTextFieldController;->codepointTransformation:Landroidx/compose/foundation/text2/input/CodepointTransformation;

    .line 22
    .line 23
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 24
    .line 25
    new-instance v1, Landroidx/compose/foundation/text2/SecureTextFieldController$focusChangeModifier$1;

    .line 26
    .line 27
    invoke-direct {v1, p0}, Landroidx/compose/foundation/text2/SecureTextFieldController$focusChangeModifier$1;-><init>(Landroidx/compose/foundation/text2/SecureTextFieldController;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1}, Landroidx/compose/ui/focus/FocusChangedModifierKt;->onFocusChanged(Landroidx/compose/ui/Modifier;Lv3/l;)Landroidx/compose/ui/Modifier;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Landroidx/compose/foundation/text2/SecureTextFieldController;->focusChangeModifier:Landroidx/compose/ui/Modifier;

    .line 35
    .line 36
    const/4 v0, 0x6

    .line 37
    const v1, 0x7fffffff

    .line 38
    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-static {v1, v2, v2, v0, v2}, Lkotlinx/coroutines/channels/o;->d(ILkotlinx/coroutines/channels/i;Lv3/l;ILjava/lang/Object;)Lkotlinx/coroutines/channels/l;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, Landroidx/compose/foundation/text2/SecureTextFieldController;->resetTimerSignal:Lkotlinx/coroutines/channels/l;

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    const/4 v5, 0x0

    .line 49
    new-instance v6, Landroidx/compose/foundation/text2/SecureTextFieldController$1;

    .line 50
    .line 51
    invoke-direct {v6, p0, v2}, Landroidx/compose/foundation/text2/SecureTextFieldController$1;-><init>(Landroidx/compose/foundation/text2/SecureTextFieldController;Lkotlin/coroutines/d;)V

    .line 52
    .line 53
    .line 54
    const/4 v7, 0x3

    .line 55
    const/4 v8, 0x0

    .line 56
    move-object v3, p1

    .line 57
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 58
    .line 59
    .line 60
    return-void
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

.method public static synthetic a(Landroidx/compose/foundation/text2/SecureTextFieldController;II)I
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/text2/SecureTextFieldController;->codepointTransformation$lambda$0(Landroidx/compose/foundation/text2/SecureTextFieldController;II)I

    move-result p0

    return p0
.end method

.method public static final synthetic access$getResetTimerSignal$p(Landroidx/compose/foundation/text2/SecureTextFieldController;)Lkotlinx/coroutines/channels/l;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/text2/SecureTextFieldController;->resetTimerSignal:Lkotlinx/coroutines/channels/l;

    return-object p0
.end method

.method public static final synthetic access$scheduleHide(Landroidx/compose/foundation/text2/SecureTextFieldController;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/text2/SecureTextFieldController;->scheduleHide()V

    return-void
.end method

.method private static final codepointTransformation$lambda$0(Landroidx/compose/foundation/text2/SecureTextFieldController;II)I
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/text2/SecureTextFieldController;->passwordRevealFilter:Landroidx/compose/foundation/text2/PasswordRevealFilter;

    invoke-virtual {p0}, Landroidx/compose/foundation/text2/PasswordRevealFilter;->getRevealCodepointIndex$foundation_release()I

    move-result p0

    if-ne p1, p0, :cond_0

    goto :goto_0

    :cond_0
    const/16 p2, 0x2022

    :goto_0
    return p2
.end method

.method private final scheduleHide()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/SecureTextFieldController;->resetTimerSignal:Lkotlinx/coroutines/channels/l;

    .line 2
    .line 3
    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lkotlinx/coroutines/channels/h0;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lkotlinx/coroutines/channels/p;->m(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/compose/foundation/text2/SecureTextFieldController;->passwordRevealFilter:Landroidx/compose/foundation/text2/PasswordRevealFilter;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/PasswordRevealFilter;->hide()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
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
.end method


# virtual methods
.method public final getCodepointTransformation()Landroidx/compose/foundation/text2/input/CodepointTransformation;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/text2/SecureTextFieldController;->codepointTransformation:Landroidx/compose/foundation/text2/input/CodepointTransformation;

    return-object v0
.end method

.method public final getFocusChangeModifier()Landroidx/compose/ui/Modifier;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/text2/SecureTextFieldController;->focusChangeModifier:Landroidx/compose/ui/Modifier;

    return-object v0
.end method

.method public final getPasswordRevealFilter()Landroidx/compose/foundation/text2/PasswordRevealFilter;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/text2/SecureTextFieldController;->passwordRevealFilter:Landroidx/compose/foundation/text2/PasswordRevealFilter;

    return-object v0
.end method
