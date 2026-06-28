.class public final La1/n$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La1/n;->v(JLjava/lang/Runnable;Ljava/lang/String;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/Runnable;

.field public final synthetic b:Landroid/os/ConditionVariable;


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;Landroid/os/ConditionVariable;)V
    .locals 0

    iput-object p1, p0, La1/n$b;->a:Ljava/lang/Runnable;

    iput-object p2, p0, La1/n$b;->b:Landroid/os/ConditionVariable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, La1/n$b;->a:Ljava/lang/Runnable;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La1/n$b;->b:Landroid/os/ConditionVariable;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/os/ConditionVariable;->open()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    iget-object v1, p0, La1/n$b;->b:Landroid/os/ConditionVariable;

    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/os/ConditionVariable;->open()V

    .line 16
    .line 17
    .line 18
    throw v0
    .line 19
    .line 20
    .line 21
.end method
