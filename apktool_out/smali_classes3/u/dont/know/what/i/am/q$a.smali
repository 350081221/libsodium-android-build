.class public abstract Lu/dont/know/what/i/am/q$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu/dont/know/what/i/am/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu/dont/know/what/i/am/q$a$a;
    }
.end annotation


# instance fields
.field public final a:[Ljava/lang/Object;

.field private b:Landroid/os/Bundle;


# direct methods
.method protected constructor <init>()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lu/dont/know/what/i/am/q$a;->a:[Ljava/lang/Object;

    return-void
.end method

.method protected constructor <init>(Lu/dont/know/what/i/am/j$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu/dont/know/what/i/am/j$c<",
            "+",
            "Lu/dont/know/what/i/am/q;",
            ">;)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    invoke-virtual {p1}, Lu/dont/know/what/i/am/j$c;->b()[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lu/dont/know/what/i/am/q$a;->a:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public declared-synchronized a()Landroid/os/Bundle;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lu/dont/know/what/i/am/q$a;->b:Landroid/os/Bundle;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lu/dont/know/what/i/am/q$a;->b:Landroid/os/Bundle;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lu/dont/know/what/i/am/q$a;->b:Landroid/os/Bundle;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    monitor-exit p0

    .line 16
    return-object v0

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    monitor-exit p0

    .line 19
    throw v0
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public b(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lu/dont/know/what/i/am/q$a;->a()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    instance-of v0, p1, Lu/dont/know/what/i/am/q$a$a;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    check-cast p1, Lu/dont/know/what/i/am/q$a$a;

    .line 14
    .line 15
    invoke-static {p1}, Lu/dont/know/what/i/am/q$a$a;->access$000(Lu/dont/know/what/i/am/q$a$a;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return-object p1
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public c(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    invoke-virtual {p0}, Lu/dont/know/what/i/am/q$a;->a()Landroid/os/Bundle;

    move-result-object v0

    new-instance v1, Lu/dont/know/what/i/am/q$a$a;

    invoke-direct {v1, p2}, Lu/dont/know/what/i/am/q$a$a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    return-void
.end method
