.class Lu/dont/know/what/i/am/h$a;
.super Lu/dont/know/what/i/am/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu/dont/know/what/i/am/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>(I)V
    .locals 0

    invoke-direct {p0, p1}, Lu/dont/know/what/i/am/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method protected e(Lu/dont/know/what/i/am/g$a;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method
