.class Lu/dont/know/what/i/am/h$b;
.super Lu/dont/know/what/i/am/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu/dont/know/what/i/am/h;->returnConstant(ILjava/lang/Object;)Lu/dont/know/what/i/am/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/Object;


# direct methods
.method constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput-object p2, p0, Lu/dont/know/what/i/am/h$b;->b:Ljava/lang/Object;

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

    iget-object p1, p0, Lu/dont/know/what/i/am/h$b;->b:Ljava/lang/Object;

    return-object p1
.end method
