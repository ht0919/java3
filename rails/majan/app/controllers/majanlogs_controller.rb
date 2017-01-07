class MajanlogsController < ApplicationController
  before_action :set_majanlog, only: [:show, :edit, :update, :destroy]

  # GET /majanlogs
  # GET /majanlogs.json
  def index
    @majanlogs = Majanlog.all
  end

  # GET /majanlogs/1
  # GET /majanlogs/1.json
  def show
  end

  # GET /majanlogs/new
  def new
    @majanlog = Majanlog.new
  end

  # GET /majanlogs/1/edit
  def edit
  end

  # POST /majanlogs
  # POST /majanlogs.json
  def create
    @majanlog = Majanlog.new(majanlog_params)

    respond_to do |format|
      if @majanlog.save
        format.html { redirect_to @majanlog, notice: 'Majanlog was successfully created.' }
        format.json { render :show, status: :created, location: @majanlog }
      else
        format.html { render :new }
        format.json { render json: @majanlog.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /majanlogs/1
  # PATCH/PUT /majanlogs/1.json
  def update
    respond_to do |format|
      if @majanlog.update(majanlog_params)
        format.html { redirect_to @majanlog, notice: 'Majanlog was successfully updated.' }
        format.json { render :show, status: :ok, location: @majanlog }
      else
        format.html { render :edit }
        format.json { render json: @majanlog.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /majanlogs/1
  # DELETE /majanlogs/1.json
  def destroy
    @majanlog.destroy
    respond_to do |format|
      format.html { redirect_to majanlogs_url, notice: 'Majanlog was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_majanlog
      @majanlog = Majanlog.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def majanlog_params
      params.require(:majanlog).permit(:date, :num, :name1, :score1, :name2, :score2, :name3, :score3, :name4, :score4)
    end
end
