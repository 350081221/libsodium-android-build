.class Lcom/ss/android/downloadlib/addownload/compliance/AppDetailInfoActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/addownload/compliance/AppDetailInfoActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ss/android/downloadlib/addownload/compliance/AppDetailInfoActivity;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/addownload/compliance/AppDetailInfoActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/AppDetailInfoActivity$1;->a:Lcom/ss/android/downloadlib/addownload/compliance/AppDetailInfoActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/AppDetailInfoActivity$1;->a:Lcom/ss/android/downloadlib/addownload/compliance/AppDetailInfoActivity;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/ss/android/downloadlib/addownload/compliance/AppDetailInfoActivity;->a(Lcom/ss/android/downloadlib/addownload/compliance/AppDetailInfoActivity;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-string p1, "lp_app_detail_click_close"

    .line 8
    .line 9
    invoke-static {p1, v0, v1}, Lcom/ss/android/downloadlib/addownload/compliance/g;->a(Ljava/lang/String;J)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/AppDetailInfoActivity$1;->a:Lcom/ss/android/downloadlib/addownload/compliance/AppDetailInfoActivity;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
