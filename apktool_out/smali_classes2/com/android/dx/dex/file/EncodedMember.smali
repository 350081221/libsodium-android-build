.class public abstract Lcom/android/dx/dex/file/EncodedMember;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/dx/util/ToHuman;


# instance fields
.field private final accessFlags:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/android/dx/dex/file/EncodedMember;->accessFlags:I

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
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


# virtual methods
.method public abstract addContents(Lcom/android/dx/dex/file/DexFile;)V
.end method

.method public abstract debugPrint(Ljava/io/PrintWriter;Z)V
.end method

.method public abstract encode(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;II)I
.end method

.method public final getAccessFlags()I
    .locals 1

    iget v0, p0, Lcom/android/dx/dex/file/EncodedMember;->accessFlags:I

    return v0
.end method

.method public abstract getName()Lcom/android/dx/rop/cst/CstString;
.end method
