.class Lcom/zzhoujay/richtext/ig/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zzhoujay/richtext/ig/j$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zzhoujay/richtext/ig/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/zzhoujay/richtext/ig/j;


# direct methods
.method constructor <init>(Lcom/zzhoujay/richtext/ig/j;)V
    .locals 0

    iput-object p1, p0, Lcom/zzhoujay/richtext/ig/j$a;->a:Lcom/zzhoujay/richtext/ig/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zzhoujay/richtext/ig/j$a;->a:Lcom/zzhoujay/richtext/ig/j;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zzhoujay/richtext/ig/j;->a(Lcom/zzhoujay/richtext/ig/j;)Ljava/util/HashMap;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lcom/zzhoujay/richtext/ig/j$a;->a:Lcom/zzhoujay/richtext/ig/j;

    .line 9
    .line 10
    invoke-static {v1}, Lcom/zzhoujay/richtext/ig/j;->a(Lcom/zzhoujay/richtext/ig/j;)Ljava/util/HashMap;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    monitor-exit v0

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    throw p1
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
