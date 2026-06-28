.class Lcom/zzhoujay/markdown/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zzhoujay/markdown/parser/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zzhoujay/markdown/c;->h(Lcom/zzhoujay/markdown/parser/b;)Landroid/text/Spannable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/zzhoujay/markdown/parser/b;

.field final synthetic b:Lcom/zzhoujay/markdown/c;


# direct methods
.method constructor <init>(Lcom/zzhoujay/markdown/c;Lcom/zzhoujay/markdown/parser/b;)V
    .locals 0

    iput-object p1, p0, Lcom/zzhoujay/markdown/c$a;->b:Lcom/zzhoujay/markdown/c;

    iput-object p2, p0, Lcom/zzhoujay/markdown/c$a;->a:Lcom/zzhoujay/markdown/parser/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getQueue()Lcom/zzhoujay/markdown/parser/b;
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/markdown/c$a;->a:Lcom/zzhoujay/markdown/parser/b;

    return-object v0
.end method
