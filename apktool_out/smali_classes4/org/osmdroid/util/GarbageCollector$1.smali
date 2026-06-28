.class Lorg/osmdroid/util/GarbageCollector$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/osmdroid/util/GarbageCollector;->gc()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/osmdroid/util/GarbageCollector;


# direct methods
.method constructor <init>(Lorg/osmdroid/util/GarbageCollector;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/util/GarbageCollector$1;->this$0:Lorg/osmdroid/util/GarbageCollector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lorg/osmdroid/util/GarbageCollector$1;->this$0:Lorg/osmdroid/util/GarbageCollector;

    .line 3
    .line 4
    invoke-static {v1}, Lorg/osmdroid/util/GarbageCollector;->access$000(Lorg/osmdroid/util/GarbageCollector;)Ljava/lang/Runnable;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lorg/osmdroid/util/GarbageCollector$1;->this$0:Lorg/osmdroid/util/GarbageCollector;

    .line 12
    .line 13
    invoke-static {v1}, Lorg/osmdroid/util/GarbageCollector;->access$100(Lorg/osmdroid/util/GarbageCollector;)Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    iget-object v2, p0, Lorg/osmdroid/util/GarbageCollector$1;->this$0:Lorg/osmdroid/util/GarbageCollector;

    .line 23
    .line 24
    invoke-static {v2}, Lorg/osmdroid/util/GarbageCollector;->access$100(Lorg/osmdroid/util/GarbageCollector;)Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 29
    .line 30
    .line 31
    throw v1
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
.end method
