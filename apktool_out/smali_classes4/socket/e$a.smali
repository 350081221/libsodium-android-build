.class Lsocket/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsocket/e;->onActivityResumed(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:Lsocket/e;


# direct methods
.method constructor <init>(Lsocket/e;Landroid/view/View;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lsocket/e$a;->c:Lsocket/e;

    iput-object p2, p0, Lsocket/e$a;->a:Landroid/view/View;

    iput-object p3, p0, Lsocket/e$a;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 3

    .line 1
    iget-object v0, p0, Lsocket/e$a;->a:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lsocket/e$a;->c:Lsocket/e;

    .line 11
    .line 12
    iget-object v1, p0, Lsocket/e$a;->b:Landroid/app/Activity;

    .line 13
    .line 14
    iget-object v2, p0, Lsocket/e$a;->a:Landroid/view/View;

    .line 15
    .line 16
    invoke-static {v0, v1, v2}, Lsocket/e;->c(Lsocket/e;Landroid/app/Activity;Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method
