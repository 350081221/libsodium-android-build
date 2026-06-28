.class Landroidx/transition/TransitionSet$2;
.super Landroidx/transition/TransitionListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/transition/TransitionSet;->prepareAnimatorsForSeeking()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/transition/TransitionSet;


# direct methods
.method constructor <init>(Landroidx/transition/TransitionSet;)V
    .locals 0

    iput-object p1, p0, Landroidx/transition/TransitionSet$2;->this$0:Landroidx/transition/TransitionSet;

    invoke-direct {p0}, Landroidx/transition/TransitionListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onTransitionCancel(Landroidx/transition/Transition;)V
    .locals 2
    .param p1    # Landroidx/transition/Transition;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/transition/TransitionSet$2;->this$0:Landroidx/transition/TransitionSet;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/transition/TransitionSet;->mTransitions:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Landroidx/transition/TransitionSet$2;->this$0:Landroidx/transition/TransitionSet;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroidx/transition/TransitionSet;->hasAnimators()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    iget-object p1, p0, Landroidx/transition/TransitionSet$2;->this$0:Landroidx/transition/TransitionSet;

    .line 17
    .line 18
    sget-object v0, Landroidx/transition/Transition$TransitionNotification;->ON_CANCEL:Landroidx/transition/Transition$TransitionNotification;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {p1, v0, v1}, Landroidx/transition/Transition;->notifyListeners(Landroidx/transition/Transition$TransitionNotification;Z)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Landroidx/transition/TransitionSet$2;->this$0:Landroidx/transition/TransitionSet;

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    iput-boolean v0, p1, Landroidx/transition/Transition;->mEnded:Z

    .line 28
    .line 29
    sget-object v0, Landroidx/transition/Transition$TransitionNotification;->ON_END:Landroidx/transition/Transition$TransitionNotification;

    .line 30
    .line 31
    invoke-virtual {p1, v0, v1}, Landroidx/transition/Transition;->notifyListeners(Landroidx/transition/Transition$TransitionNotification;Z)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
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
.end method
