.class Lcom/android/dx/dex/file/CodeItem$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/dx/dex/code/DalvCode$AssignIndicesCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/dx/dex/file/CodeItem;->place0(Lcom/android/dx/dex/file/Section;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/dx/dex/file/CodeItem;

.field final synthetic val$file:Lcom/android/dx/dex/file/DexFile;


# direct methods
.method constructor <init>(Lcom/android/dx/dex/file/CodeItem;Lcom/android/dx/dex/file/DexFile;)V
    .locals 0

    iput-object p1, p0, Lcom/android/dx/dex/file/CodeItem$1;->this$0:Lcom/android/dx/dex/file/CodeItem;

    iput-object p2, p0, Lcom/android/dx/dex/file/CodeItem$1;->val$file:Lcom/android/dx/dex/file/DexFile;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getIndex(Lcom/android/dx/rop/cst/Constant;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/file/CodeItem$1;->val$file:Lcom/android/dx/dex/file/DexFile;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/android/dx/dex/file/DexFile;->findItemOrNull(Lcom/android/dx/rop/cst/Constant;)Lcom/android/dx/dex/file/IndexedItem;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    const/4 p1, -0x1

    .line 10
    return p1

    .line 11
    :cond_0
    invoke-virtual {p1}, Lcom/android/dx/dex/file/IndexedItem;->getIndex()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
