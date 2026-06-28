.class Lorg/jdeferred/impl/f$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jdeferred/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/jdeferred/impl/f;-><init>(Lorg/jdeferred/p;Lorg/jdeferred/h;Lorg/jdeferred/k;Lorg/jdeferred/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lorg/jdeferred/g<",
        "TD;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lorg/jdeferred/impl/f;


# direct methods
.method constructor <init>(Lorg/jdeferred/impl/f;)V
    .locals 0

    iput-object p1, p0, Lorg/jdeferred/impl/f$c;->a:Lorg/jdeferred/impl/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)V"
        }
    .end annotation

    iget-object v0, p0, Lorg/jdeferred/impl/f$c;->a:Lorg/jdeferred/impl/f;

    invoke-static {v0}, Lorg/jdeferred/impl/f;->H(Lorg/jdeferred/impl/f;)Lorg/jdeferred/h;

    move-result-object v1

    invoke-interface {v1, p1}, Lorg/jdeferred/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lorg/jdeferred/impl/d;->g(Ljava/lang/Object;)Lorg/jdeferred/b;

    return-void
.end method
