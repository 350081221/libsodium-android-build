.class Lorg/jdeferred/multiple/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jdeferred/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/jdeferred/multiple/a;-><init>([Lorg/jdeferred/p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lorg/jdeferred/p;

.field final synthetic c:Lorg/jdeferred/multiple/a;


# direct methods
.method constructor <init>(Lorg/jdeferred/multiple/a;ILorg/jdeferred/p;)V
    .locals 0

    iput-object p1, p0, Lorg/jdeferred/multiple/a$b;->c:Lorg/jdeferred/multiple/a;

    iput p2, p0, Lorg/jdeferred/multiple/a$b;->a:I

    iput-object p3, p0, Lorg/jdeferred/multiple/a$b;->b:Lorg/jdeferred/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lorg/jdeferred/multiple/a$b;->c:Lorg/jdeferred/multiple/a;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lorg/jdeferred/multiple/a$b;->c:Lorg/jdeferred/multiple/a;

    .line 5
    .line 6
    invoke-virtual {v1}, Lorg/jdeferred/impl/b;->w()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v1, p0, Lorg/jdeferred/multiple/a$b;->c:Lorg/jdeferred/multiple/a;

    .line 15
    .line 16
    new-instance v9, Lorg/jdeferred/multiple/d;

    .line 17
    .line 18
    invoke-static {v1}, Lorg/jdeferred/multiple/a;->G(Lorg/jdeferred/multiple/a;)Ljava/util/concurrent/atomic/AtomicInteger;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    iget-object v2, p0, Lorg/jdeferred/multiple/a$b;->c:Lorg/jdeferred/multiple/a;

    .line 27
    .line 28
    invoke-static {v2}, Lorg/jdeferred/multiple/a;->H(Lorg/jdeferred/multiple/a;)Ljava/util/concurrent/atomic/AtomicInteger;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    iget-object v2, p0, Lorg/jdeferred/multiple/a$b;->c:Lorg/jdeferred/multiple/a;

    .line 37
    .line 38
    invoke-static {v2}, Lorg/jdeferred/multiple/a;->I(Lorg/jdeferred/multiple/a;)I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    iget v6, p0, Lorg/jdeferred/multiple/a$b;->a:I

    .line 43
    .line 44
    iget-object v7, p0, Lorg/jdeferred/multiple/a$b;->b:Lorg/jdeferred/p;

    .line 45
    .line 46
    move-object v2, v9

    .line 47
    move-object v8, p1

    .line 48
    invoke-direct/range {v2 .. v8}, Lorg/jdeferred/multiple/d;-><init>(IIIILorg/jdeferred/p;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v9}, Lorg/jdeferred/impl/d;->q(Ljava/lang/Object;)Lorg/jdeferred/b;

    .line 52
    .line 53
    .line 54
    monitor-exit v0

    .line 55
    return-void

    .line 56
    :catchall_0
    move-exception p1

    .line 57
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    throw p1
.end method
