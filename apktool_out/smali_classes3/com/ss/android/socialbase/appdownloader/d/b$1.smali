.class Lcom/ss/android/socialbase/appdownloader/d/b$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/appdownloader/d/b;->a(Ljava/util/List;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:I

.field final synthetic c:Lcom/ss/android/socialbase/appdownloader/d/b;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/appdownloader/d/b;Ljava/util/List;I)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/d/b$1;->c:Lcom/ss/android/socialbase/appdownloader/d/b;

    iput-object p2, p0, Lcom/ss/android/socialbase/appdownloader/d/b$1;->a:Ljava/util/List;

    iput p3, p0, Lcom/ss/android/socialbase/appdownloader/d/b$1;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/d/b$1;->c:Lcom/ss/android/socialbase/appdownloader/d/b;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/ss/android/socialbase/appdownloader/d/b$1;->a:Ljava/util/List;

    .line 4
    .line 5
    iget v2, p0, Lcom/ss/android/socialbase/appdownloader/d/b$1;->b:I

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lcom/ss/android/socialbase/appdownloader/d/b;->a(Lcom/ss/android/socialbase/appdownloader/d/b;Ljava/util/List;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :catch_0
    move-exception v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 13
    .line 14
    .line 15
    :goto_0
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
