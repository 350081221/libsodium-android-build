.class public final synthetic Lcom/yuanqi/master/tools/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/yuanqi/master/tools/ZipFileAdapter;

.field public final synthetic b:Lcom/yuanqi/master/tools/ZipFileAdapter$ViewHolder;


# direct methods
.method public synthetic constructor <init>(Lcom/yuanqi/master/tools/ZipFileAdapter;Lcom/yuanqi/master/tools/ZipFileAdapter$ViewHolder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/master/tools/g1;->a:Lcom/yuanqi/master/tools/ZipFileAdapter;

    iput-object p2, p0, Lcom/yuanqi/master/tools/g1;->b:Lcom/yuanqi/master/tools/ZipFileAdapter$ViewHolder;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/yuanqi/master/tools/g1;->a:Lcom/yuanqi/master/tools/ZipFileAdapter;

    iget-object v1, p0, Lcom/yuanqi/master/tools/g1;->b:Lcom/yuanqi/master/tools/ZipFileAdapter$ViewHolder;

    invoke-static {v0, v1, p1}, Lcom/yuanqi/master/tools/ZipFileAdapter;->a(Lcom/yuanqi/master/tools/ZipFileAdapter;Lcom/yuanqi/master/tools/ZipFileAdapter$ViewHolder;Landroid/view/View;)V

    return-void
.end method
