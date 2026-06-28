.class Lorg/jdeferred/android/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jdeferred/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/jdeferred/android/c;-><init>(Lorg/jdeferred/p;Lorg/jdeferred/android/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lorg/jdeferred/j<",
        "TF;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lorg/jdeferred/android/c;


# direct methods
.method constructor <init>(Lorg/jdeferred/android/c;)V
    .locals 0

    iput-object p1, p0, Lorg/jdeferred/android/c$a;->a:Lorg/jdeferred/android/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFail(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TF;)V"
        }
    .end annotation

    iget-object v0, p0, Lorg/jdeferred/android/c$a;->a:Lorg/jdeferred/android/c;

    invoke-virtual {v0, p1}, Lorg/jdeferred/impl/d;->h(Ljava/lang/Object;)Lorg/jdeferred/b;

    return-void
.end method
