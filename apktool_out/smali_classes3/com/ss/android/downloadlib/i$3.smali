.class Lcom/ss/android/downloadlib/i$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/i;->a(Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Z

.field final synthetic c:Lcom/ss/android/downloadlib/i;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/i;Ljava/lang/String;Z)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/downloadlib/i$3;->c:Lcom/ss/android/downloadlib/i;

    iput-object p2, p0, Lcom/ss/android/downloadlib/i$3;->a:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/ss/android/downloadlib/i$3;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/ss/android/downloadlib/i$3;->c:Lcom/ss/android/downloadlib/i;

    invoke-static {v0}, Lcom/ss/android/downloadlib/i;->b(Lcom/ss/android/downloadlib/i;)Lcom/ss/android/downloadlib/g;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadlib/i$3;->a:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/ss/android/downloadlib/i$3;->b:Z

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadlib/g;->a(Ljava/lang/String;Z)V

    return-void
.end method
