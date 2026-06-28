.class public abstract Lorg/jdeferred/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<D:",
        "Ljava/lang/Object;",
        "P:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "TD;>;"
    }
.end annotation


# instance fields
.field private final a:Lorg/jdeferred/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jdeferred/b<",
            "TD;",
            "Ljava/lang/Throwable;",
            "TP;>;"
        }
    .end annotation
.end field

.field private final b:Lorg/jdeferred/e$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lorg/jdeferred/impl/d;

    invoke-direct {v0}, Lorg/jdeferred/impl/d;-><init>()V

    iput-object v0, p0, Lorg/jdeferred/c;->a:Lorg/jdeferred/b;

    .line 3
    sget-object v0, Lorg/jdeferred/e$a;->DEFAULT:Lorg/jdeferred/e$a;

    iput-object v0, p0, Lorg/jdeferred/c;->b:Lorg/jdeferred/e$a;

    return-void
.end method

.method public constructor <init>(Lorg/jdeferred/e$a;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v0, Lorg/jdeferred/impl/d;

    invoke-direct {v0}, Lorg/jdeferred/impl/d;-><init>()V

    iput-object v0, p0, Lorg/jdeferred/c;->a:Lorg/jdeferred/b;

    .line 6
    iput-object p1, p0, Lorg/jdeferred/c;->b:Lorg/jdeferred/e$a;

    return-void
.end method


# virtual methods
.method protected a()Lorg/jdeferred/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/jdeferred/b<",
            "TD;",
            "Ljava/lang/Throwable;",
            "TP;>;"
        }
    .end annotation

    iget-object v0, p0, Lorg/jdeferred/c;->a:Lorg/jdeferred/b;

    return-object v0
.end method

.method public b()Lorg/jdeferred/e$a;
    .locals 1

    iget-object v0, p0, Lorg/jdeferred/c;->b:Lorg/jdeferred/e$a;

    return-object v0
.end method

.method protected c(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;)V"
        }
    .end annotation

    iget-object v0, p0, Lorg/jdeferred/c;->a:Lorg/jdeferred/b;

    invoke-interface {v0, p1}, Lorg/jdeferred/b;->q(Ljava/lang/Object;)Lorg/jdeferred/b;

    return-void
.end method
