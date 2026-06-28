.class interface abstract Landroidx/transition/Transition$TransitionNotification;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/Transition;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x608
    name = "TransitionNotification"
.end annotation


# static fields
.field public static final ON_CANCEL:Landroidx/transition/Transition$TransitionNotification;

.field public static final ON_END:Landroidx/transition/Transition$TransitionNotification;

.field public static final ON_PAUSE:Landroidx/transition/Transition$TransitionNotification;

.field public static final ON_RESUME:Landroidx/transition/Transition$TransitionNotification;

.field public static final ON_START:Landroidx/transition/Transition$TransitionNotification;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/transition/e;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/transition/e;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/transition/Transition$TransitionNotification;->ON_START:Landroidx/transition/Transition$TransitionNotification;

    .line 7
    .line 8
    new-instance v0, Landroidx/transition/f;

    .line 9
    .line 10
    invoke-direct {v0}, Landroidx/transition/f;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Landroidx/transition/Transition$TransitionNotification;->ON_END:Landroidx/transition/Transition$TransitionNotification;

    .line 14
    .line 15
    new-instance v0, Landroidx/transition/g;

    .line 16
    .line 17
    invoke-direct {v0}, Landroidx/transition/g;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Landroidx/transition/Transition$TransitionNotification;->ON_CANCEL:Landroidx/transition/Transition$TransitionNotification;

    .line 21
    .line 22
    new-instance v0, Landroidx/transition/h;

    .line 23
    .line 24
    invoke-direct {v0}, Landroidx/transition/h;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Landroidx/transition/Transition$TransitionNotification;->ON_PAUSE:Landroidx/transition/Transition$TransitionNotification;

    .line 28
    .line 29
    new-instance v0, Landroidx/transition/i;

    .line 30
    .line 31
    invoke-direct {v0}, Landroidx/transition/i;-><init>()V

    .line 32
    .line 33
    .line 34
    sput-object v0, Landroidx/transition/Transition$TransitionNotification;->ON_RESUME:Landroidx/transition/Transition$TransitionNotification;

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
.end method

.method public static synthetic a(Landroidx/transition/Transition$TransitionListener;Landroidx/transition/Transition;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/transition/Transition$TransitionNotification;->lambda$static$1(Landroidx/transition/Transition$TransitionListener;Landroidx/transition/Transition;Z)V

    return-void
.end method

.method public static synthetic b(Landroidx/transition/Transition$TransitionListener;Landroidx/transition/Transition;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/transition/Transition$TransitionNotification;->lambda$static$0(Landroidx/transition/Transition$TransitionListener;Landroidx/transition/Transition;Z)V

    return-void
.end method

.method public static synthetic c(Landroidx/transition/Transition$TransitionListener;Landroidx/transition/Transition;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/transition/Transition$TransitionNotification;->lambda$static$2(Landroidx/transition/Transition$TransitionListener;Landroidx/transition/Transition;Z)V

    return-void
.end method

.method private static synthetic lambda$static$0(Landroidx/transition/Transition$TransitionListener;Landroidx/transition/Transition;Z)V
    .locals 0

    invoke-interface {p0, p1}, Landroidx/transition/Transition$TransitionListener;->onTransitionCancel(Landroidx/transition/Transition;)V

    return-void
.end method

.method private static synthetic lambda$static$1(Landroidx/transition/Transition$TransitionListener;Landroidx/transition/Transition;Z)V
    .locals 0

    invoke-interface {p0, p1}, Landroidx/transition/Transition$TransitionListener;->onTransitionPause(Landroidx/transition/Transition;)V

    return-void
.end method

.method private static synthetic lambda$static$2(Landroidx/transition/Transition$TransitionListener;Landroidx/transition/Transition;Z)V
    .locals 0

    invoke-interface {p0, p1}, Landroidx/transition/Transition$TransitionListener;->onTransitionResume(Landroidx/transition/Transition;)V

    return-void
.end method


# virtual methods
.method public abstract notifyListener(Landroidx/transition/Transition$TransitionListener;Landroidx/transition/Transition;Z)V
    .param p1    # Landroidx/transition/Transition$TransitionListener;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/transition/Transition;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method
