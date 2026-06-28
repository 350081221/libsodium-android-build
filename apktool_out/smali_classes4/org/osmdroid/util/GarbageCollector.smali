.class public Lorg/osmdroid/util/GarbageCollector;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final mAction:Ljava/lang/Runnable;

.field private final mRunning:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lorg/osmdroid/util/GarbageCollector;->mRunning:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    iput-object p1, p0, Lorg/osmdroid/util/GarbageCollector;->mAction:Ljava/lang/Runnable;

    .line 13
    .line 14
    return-void
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
    .line 28
    .line 29
    .line 30
    .line 31
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
.end method

.method static synthetic access$000(Lorg/osmdroid/util/GarbageCollector;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lorg/osmdroid/util/GarbageCollector;->mAction:Ljava/lang/Runnable;

    return-object p0
.end method

.method static synthetic access$100(Lorg/osmdroid/util/GarbageCollector;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lorg/osmdroid/util/GarbageCollector;->mRunning:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method


# virtual methods
.method public gc()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/osmdroid/util/GarbageCollector;->mRunning:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    return v0

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/Thread;

    .line 13
    .line 14
    new-instance v2, Lorg/osmdroid/util/GarbageCollector$1;

    .line 15
    .line 16
    invoke-direct {v2, p0}, Lorg/osmdroid/util/GarbageCollector$1;-><init>(Lorg/osmdroid/util/GarbageCollector;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    const-string v2, "GarbageCollector"

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setPriority(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 31
    .line 32
    .line 33
    return v1
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

.method public isRunning()Z
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/util/GarbageCollector;->mRunning:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method
