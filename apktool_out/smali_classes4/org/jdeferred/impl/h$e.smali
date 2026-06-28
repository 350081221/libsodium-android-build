.class Lorg/jdeferred/impl/h$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jdeferred/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/jdeferred/impl/h;->F(Lorg/jdeferred/p;)Lorg/jdeferred/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lorg/jdeferred/j<",
        "TF_OUT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lorg/jdeferred/impl/h;


# direct methods
.method constructor <init>(Lorg/jdeferred/impl/h;)V
    .locals 0

    iput-object p1, p0, Lorg/jdeferred/impl/h$e;->a:Lorg/jdeferred/impl/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFail(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TF_OUT;)V"
        }
    .end annotation

    iget-object v0, p0, Lorg/jdeferred/impl/h$e;->a:Lorg/jdeferred/impl/h;

    invoke-virtual {v0, p1}, Lorg/jdeferred/impl/d;->h(Ljava/lang/Object;)Lorg/jdeferred/b;

    return-void
.end method
