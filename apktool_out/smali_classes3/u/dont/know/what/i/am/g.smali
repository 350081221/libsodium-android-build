.class public abstract Lu/dont/know/what/i/am/g;
.super Lu/dont/know/what/i/am/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu/dont/know/what/i/am/g$b;,
        Lu/dont/know/what/i/am/g$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lu/dont/know/what/i/am/q;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lu/dont/know/what/i/am/q;-><init>(I)V

    return-void
.end method


# virtual methods
.method protected afterHookedMethod(Lu/dont/know/what/i/am/g$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    return-void
.end method

.method protected beforeHookedMethod(Lu/dont/know/what/i/am/g$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    return-void
.end method

.method public callAfterHookedMethod(Lu/dont/know/what/i/am/g$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lu/dont/know/what/i/am/g;->afterHookedMethod(Lu/dont/know/what/i/am/g$a;)V

    return-void
.end method

.method public callBeforeHookedMethod(Lu/dont/know/what/i/am/g$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lu/dont/know/what/i/am/g;->beforeHookedMethod(Lu/dont/know/what/i/am/g$a;)V

    return-void
.end method
