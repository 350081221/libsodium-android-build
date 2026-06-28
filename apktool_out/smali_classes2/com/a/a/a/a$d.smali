.class final Lcom/a/a/a/a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/a/a/a/a;->k(Lcom/a/a/a/b;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/a/a/a/a$d;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/a/a/a/a$d;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/a/a/a/a$d;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/a/a/a/a$d;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/a/a/a/a;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
