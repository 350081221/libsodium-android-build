.class Lu/dont/know/what/i/am/i$a;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu/dont/know/what/i/am/i;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lu/dont/know/what/i/am/i;


# direct methods
.method constructor <init>(Lu/dont/know/what/i/am/i;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lu/dont/know/what/i/am/i$a;->a:Lu/dont/know/what/i/am/i;

    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lu/dont/know/what/i/am/i$a;->a:Lu/dont/know/what/i/am/i;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lu/dont/know/what/i/am/i$a;->a:Lu/dont/know/what/i/am/i;

    .line 5
    .line 6
    invoke-static {v1}, Lu/dont/know/what/i/am/i;->a(Lu/dont/know/what/i/am/i;)V

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception v1

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw v1
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
.end method
