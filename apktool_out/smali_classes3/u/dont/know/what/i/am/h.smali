.class public abstract Lu/dont/know/what/i/am/h;
.super Lu/dont/know/what/i/am/g;
.source "SourceFile"


# static fields
.field public static final DO_NOTHING:Lu/dont/know/what/i/am/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lu/dont/know/what/i/am/h$a;

    const/16 v1, 0x4e20

    invoke-direct {v0, v1}, Lu/dont/know/what/i/am/h$a;-><init>(I)V

    sput-object v0, Lu/dont/know/what/i/am/h;->DO_NOTHING:Lu/dont/know/what/i/am/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lu/dont/know/what/i/am/g;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lu/dont/know/what/i/am/g;-><init>(I)V

    return-void
.end method

.method public static returnConstant(ILjava/lang/Object;)Lu/dont/know/what/i/am/h;
    .locals 1

    .line 2
    new-instance v0, Lu/dont/know/what/i/am/h$b;

    invoke-direct {v0, p0, p1}, Lu/dont/know/what/i/am/h$b;-><init>(ILjava/lang/Object;)V

    return-object v0
.end method

.method public static returnConstant(Ljava/lang/Object;)Lu/dont/know/what/i/am/h;
    .locals 1

    const/16 v0, 0x32

    .line 1
    invoke-static {v0, p0}, Lu/dont/know/what/i/am/h;->returnConstant(ILjava/lang/Object;)Lu/dont/know/what/i/am/h;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected final afterHookedMethod(Lu/dont/know/what/i/am/g$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    return-void
.end method

.method protected final beforeHookedMethod(Lu/dont/know/what/i/am/g$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Lu/dont/know/what/i/am/h;->replaceHookedMethod(Lu/dont/know/what/i/am/g$a;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, Lu/dont/know/what/i/am/g$a;->h(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catchall_0
    move-exception v0

    .line 10
    invoke-virtual {p1, v0}, Lu/dont/know/what/i/am/g$a;->i(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    :goto_0
    return-void
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

.method protected abstract replaceHookedMethod(Lu/dont/know/what/i/am/g$a;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation
.end method
