.class public final Lt/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lt/b;


# direct methods
.method public constructor <init>(Lt/b;)V
    .locals 0

    iput-object p1, p0, Lt/c;->a:Lt/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lt/c;->a:Lt/b;

    invoke-static {v0}, Lt/b;->c(Lt/b;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lt/d;->c(Ljava/lang/Throwable;)V

    return-void
.end method
